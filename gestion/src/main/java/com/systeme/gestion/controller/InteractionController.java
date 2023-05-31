package com.systeme.gestion.controller;

import com.systeme.gestion.entity.Contact;
import com.systeme.gestion.entity.Interaction;
import com.systeme.gestion.service.InteractionServiceIT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/interactions")
public class InteractionController {
    @Autowired
    private  InteractionServiceIT interactionService;
    @PostMapping
    public void enregistrerInteraction(@RequestBody Interaction interaction) {
        interactionService.enregistrerInteraction(interaction);
    }
    @GetMapping("/{contactId}")
    public List<Interaction> getHistoriqueInteractions(@PathVariable Long contactId) {
        return interactionService.getHistoriqueInteractions(contactId);
    }


}
