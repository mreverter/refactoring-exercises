package exercise3;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon();
        Action action = new Action();
        pokemon.getAmountOfEvil(action);

        List<Fight> fightList = pokemon.getFights(Date.valueOf("2019-02-01"),Date.valueOf("2019-02-04"), BigDecimal.ONE,BigDecimal.TEN);

        pokemon.getCompleteNumber();
        pokemon.getAreaCode();


    }
}