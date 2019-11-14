package exercise3;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Pokemon {


    private Integer energy;
    private Integer health;
    private PokemonType type;
    private ArrayList<Fight> fights;
    private List<Integer> number;

    public int getAmountOfEvil(Action action) {
        return action.getAmountOfEvil();
    }

    public ArrayList<Fight> getFights(Date sinceDate, Date untilDate, BigDecimal energyLostMin, BigDecimal energyLostMax) {
        return new ArrayList<>(); //Pasan cosas
    }

    public String getCompleteNumber() {
        Integer areaCode = this.number.get(0);
        Integer number = this.number.get(1);
        return String.valueOf(areaCode) + String.valueOf(number);

    }

    public Integer getAreaCode() {
        return this.number.get(0);
    }

    public void heal(Medicine medicine) {
        if (this.energy > 50 && this.type == PokemonType.AGUA) {
            this.health = this.health + medicine.getHeal();
            this.energy = this.energy * 10;
        }
        if (this.energy > 50 && this.energy < 250 && this.type == PokemonType.TIERRA) {
            this.health = this.health + medicine.getHeal();
            this.energy = this.energy * 5;
        }
        if (this.type == PokemonType.FUEGO) {
            this.health = 0;
            this.energy = this.energy * 0;
        }
    }
}
