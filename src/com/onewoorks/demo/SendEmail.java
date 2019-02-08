/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.onewoorks.demo;
import com.onewoorks.MailApi;

/**
 *
 * @author iwang
 */
public class SendEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MailApi mailApi = new MailApi();
        mailApi.sender = args[0];
        mailApi.to = args[1];
        mailApi.subject = args[2];
        mailApi.message = args[3];
        mailApi.postEmail();
    }
    
}
