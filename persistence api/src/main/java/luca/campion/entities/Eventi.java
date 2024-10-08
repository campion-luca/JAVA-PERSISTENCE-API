package luca.campion.entities;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity

@Table(name="eventi")


public class Eventi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="titolo_evento", nullable = false)
    private String titolo;
    @Column(name="data_evento", nullable = false)
    private LocalDate dataEvento;
    private String descrizione;
    @Column(name="numero_massimo_dei_partecipanti", nullable = false)
    private int numeroMassimoPartecipanti;
    @Column(name="tipo_di_evento", nullable = false)
    @Enumerated(EnumType.STRING)
    private tipoEvento tipoEvento;


    public Eventi(){} // costruttore vuoto nella entities

    public Eventi(String descrizione, int numeroMassimoPartecipanti, luca.campion.entities.tipoEvento tipoEvento, String titolo) {
        this.dataEvento = LocalDate.now();
        this.descrizione = descrizione;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        this.tipoEvento = tipoEvento;
        this.titolo = titolo;
    }


    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public luca.campion.entities.tipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(luca.campion.entities.tipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    @Override
    public String toString() {
        return "Eventi{" +
                "dataEvento=" + dataEvento +
                ", id=" + id +
                ", titolo='" + titolo + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                ", tipoEvento=" + tipoEvento +
                '}';
    }
}
