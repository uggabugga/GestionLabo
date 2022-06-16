package com.gestionlabo.gestionlabo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@DiscriminatorValue("M")
public class Mobilite extends Besoin{
    private String ReferenceBillet;
    private double prixBillet;
    private double FarisSejour;
}
