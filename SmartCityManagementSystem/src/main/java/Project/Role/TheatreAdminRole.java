/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;

import Project.SmartCity.SmartCity;

import Project.UserAccount.UserAccount;
import UI.ShopAdminRole.ShopAdminWorkAreaJPanel;
import UI.TheatreAdminRole.TheatreAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunakS
 */
public class TheatreAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, SmartCity business) {
        return new TheatreAdminWorkAreaJPanel(userProcessContainer, account, business);
    }

}
