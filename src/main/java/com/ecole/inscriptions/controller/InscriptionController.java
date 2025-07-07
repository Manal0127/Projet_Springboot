package com.ecole.inscriptions.controller;

import com.ecole.inscriptions.model.Inscription;
import com.ecole.inscriptions.repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class InscriptionController {

    @Autowired
    private InscriptionRepository repo;

    @GetMapping("/")
    public String formulaire(Model model) {
        model.addAttribute("inscription", new Inscription());
        return "inscription";
    }

    @PostMapping("/enregistrer")
    public String enregistrerInscription(@ModelAttribute Inscription inscription, Model model) {
        repo.save(inscription);
        model.addAttribute("inscription", new Inscription()); // formulaire vide
        model.addAttribute("message", "Inscription enregistrée avec succès !");
        return "inscription";  // retourne à la page formulaire
    }


    @GetMapping("/liste")
    public String listeInscrits(Model model) {
        model.addAttribute("inscriptions", repo.findAll());
        return "liste";
    }
}