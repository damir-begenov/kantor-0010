package kz.dossier.dto;

public class SamrukDTO {
    private String period;
    private String sum;
    private Long number;
    private Long Customers;

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Long getCustomers() {
        return Customers;
    }

    public void setCustomers(Long customers) {
        Customers = customers;
    }
}
