import add.Inhabitants;

import java.util.Arrays;

//import add.Beneficiaries;
public class Main {
    public static void main(String[] args) {
        Inhabitants allana = new Inhabitants("Allana");

        System.out.println(Arrays.deepToString(allana.getEnergyConsumption()));
        System.out.print((allana.energySumMonth()));
    }}
