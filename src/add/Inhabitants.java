package add;
public class Inhabitants {
    private String name;
    private int[][] energyConsumption;

    public Inhabitants(String name) {
        this.name = name;
        this.energyConsumption = new int[12][];
        for (int i = 0; i < 12; i++) {
            int daysInMonth = getDaysInMonth(i + 1);
            this.energyConsumption[i] = new int[daysInMonth];
            for (int j = 0; j < daysInMonth; j++) {
                this.energyConsumption[i][j] = (int) (Math.random() * 1000);

            }
        }


    }
    public int energySumYear() {
        int total_year = 0;
        for (int i = 0; i < 12; i++) {


            for (int j = 0; j < energyConsumption[12]; j++) {
                total_year+=this.energyConsumption[i][j];
    }}

        return total_year;
    }
    public int energySumMonth() {
        int total_month = 0;
        int month = 2;
        int daysInMonth = getDaysInMonth(month);
        for (int j = 0; j < daysInMonth; j++) {
            total_month+=this.energyConsumption[month][j];
            }

        return total_month;
    }

    public String getName() {
        return name;
    }

    public int[][] getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(int[][] energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public int getDaysInMonth(int month) {
        int days = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;

            case 4, 6, 9, 11 -> days = 30;
            case 2 -> days = 28;
            default -> days = 0;
        }
        return days;






        }

    }








