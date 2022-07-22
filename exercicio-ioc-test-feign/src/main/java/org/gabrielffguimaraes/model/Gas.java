package org.gabrielffguimaraes.model;

public class Gas extends Fuel {
    public Gas() {
        super(5.2 ,
                "Gas" ,
                150 ,
                0 ,
                18);
    }

    public String fuelInfo() {
        StringBuilder sb = new StringBuilder();

        sb.append("## Gas ## |");
        sb.append(String.format(" Reservatory : %.2f",this.getReservatory()));
        sb.append(" Limit : "+this.getLimit()+" m3 .");

        return sb.toString();
    }
}
