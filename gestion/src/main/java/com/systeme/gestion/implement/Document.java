package com.systeme.gestion.implement;

import com.systeme.gestion.entity.Interaction;

public class Document {
    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    String document;
    Interaction interaction;

    public Interaction getInteraction() {
        return interaction;
    }

    public void setInteraction(Interaction interaction) {
        this.interaction = interaction;
    }
}
