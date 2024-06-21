package com.xero.testApi;

import com.xero.api.ApiClient;
import com.xero.models.accounting.*;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        ApiClient defaultClient = new ApiClient("https://api.xero.com", null, null, null);

        
        defaultClient.setAccessToken(System.getenv("AUTHORIZATION_CODE"));

        // Initialize the API
        AccountingApi apiInstance = new AccountingApi(defaultClient);

        try {
            
            List<Account> accounts = apiInstance.getAccounts("your_tenant_id", null, null, null);
            for (Account account : accounts) {
                System.out.println(account.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    

