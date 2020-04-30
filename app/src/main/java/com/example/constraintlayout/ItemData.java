package com.example.constraintlayout;
public class ItemData {

    private String tv_ios_developer;
    private String tx_date_item;
    private String tx_company_name_item;
    private String tx_city_name_item;

    public ItemData(String tv_ios_developer, String tx_date_item, String tx_company_name_item, String tx_city_name_item) {
        this.tv_ios_developer = tv_ios_developer;
        this.tx_date_item = tx_date_item;
        this.tx_company_name_item = tx_company_name_item;
        this.tx_city_name_item = tx_city_name_item;
    }

    public String getTv_ios_developer() {
        return tv_ios_developer;
    }

    public void setTv_ios_developer(String tv_ios_developer) {
        this.tv_ios_developer = tv_ios_developer;
    }

    public String getTx_date_item() {
        return tx_date_item;
    }

    public void setTx_date_item(String tx_date_item) {
        this.tx_date_item = tx_date_item;
    }

    public String getTx_company_name_item() {
        return tx_company_name_item;
    }

    public void setTx_company_name_item(String tx_company_name_item) {
        this.tx_company_name_item = tx_company_name_item;
    }

    public String getTx_city_name_item() {
        return tx_city_name_item;
    }

    public void setTx_city_name_item(String tx_city_name_item) {
        this.tx_city_name_item = tx_city_name_item;
    }
}
