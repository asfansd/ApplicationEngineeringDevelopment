/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminWorkArea;

import Project.SmartCity.Establishment.Restaurant;
import Project.SmartCity.Establishment.Shop;
import Project.SmartCity.Establishment.Theatre;
import Project.SmartCity.SmartCity;
import Project.SmartCity.TransportationSystem.Bus;
import Project.SmartCity.TransportationSystem.Cruise;
import Project.SmartCity.TransportationSystem.Flight;
import Project.SmartCity.TransportationSystem.Train;
import static UI.SystemAdminWorkArea.HeadCountByTransportReport.BusHeadCount;
import static UI.SystemAdminWorkArea.HeadCountByTransportReport.CruiseHeadCount;
import static UI.SystemAdminWorkArea.HeadCountByTransportReport.FlightHeadCount;
import static UI.SystemAdminWorkArea.HeadCountByTransportReport.TrainHeadCount;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author latis
 */
public class RevenueByEstablishment extends javax.swing.JPanel {


    public SmartCity business;
    public String shopRevenue="0", restaurantRevenue="0", theatreRevenue="0"; 
    /**
     * Creates new form RevenueByEstablishment
     */
    
    private Map<Color, Integer> bars = new LinkedHashMap<Color, Integer>();
    /**
     * Creates new form HeadCountByTransportReport
     */
    
    public void addBar(Color color, int value)
	{
		bars.put(color, value);
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		// determine longest bar
		
		int max = Integer.MIN_VALUE;
		for (Integer value : bars.values())
		{
			max = Math.max(max, value);
		}
		
		// paint bars
		
		int width = (getWidth() / bars.size()) - 2;
		int x = 1;
		for (Color color : bars.keySet())
		{
			int value = bars.get(color);
			int height = (int) 
                            ((getHeight()-5) * ((double)value / max));
			g.setColor(color);
			g.fillRect(x, getHeight() - height, width, height);
			g.setColor(Color.black);
			g.drawRect(x, getHeight() - height, width, height);
			x += (width + 2);
		}
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(bars.size() * 10 + 2, 50);
	}
        
        public static void main(String[] args)
	{
                JLabel jLabelBus = new JLabel();
                jLabelBus.setText("Bus");
                
		JFrame frame = new JFrame("Bar Chart");
		HeadCountByTransportReport chart = new HeadCountByTransportReport();
		//chart.addBar(Color.pink, shopRevenue);
		//chart.addBar(Color.CYAN, restaurantRevenue);
		//chart.addBar(Color.GRAY, theatreRevenue);
		//chart.addBar(Color.MAGENTA, CruiseHeadCount);	
                chart.add("Bus", jLabelBus);
		frame.getContentPane().add(chart);
		frame.pack();
		frame.setVisible(true);
                frame.setSize(2000/2, 800/2);
                frame.setLocation(659, 338);
	}

      
    
    public RevenueByEstablishment(SmartCity business) {
        this.business = business;
        for(Shop s : business.getShopDirectory().getShopList()){
            shopRevenue = Integer.toString(Integer.parseInt(shopRevenue)+ Integer.parseInt(s.getRevenue()));
        }
        
        for(Restaurant r : business.getRestaurantDirectory().getRestaurantList()){
            restaurantRevenue = Integer.toString(Integer.parseInt(restaurantRevenue)+ Integer.parseInt(r.getRevenue()));
        }
        
        for(Theatre t : business.getTheatreDirectory().getTheatreList()){
            theatreRevenue = Integer.toString(Integer.parseInt(theatreRevenue)+ Integer.parseInt(t.getRevenue()));
        }
            
        System.out.println("Shop"+shopRevenue);
        System.out.println("Restaurant"+restaurantRevenue);
        System.out.println("Theatre"+theatreRevenue);

        jLabel1.setText("Revenue from Shops - "+shopRevenue);
        jLabel2.setText("Revenue from Restaurants - "+restaurantRevenue);
        jLabel3.setText("Revenue from Theaters - "+theatreRevenue);
        //              System.out.println("Bus Head Count = "+BusHeadCount);
//          System.out.println("Train Head Count = "+TrainHeadCount);
//          System.out.println("Flight Head Count = "+FlightHeadCount);
//          System.out.println("Cruise Head Count = "+CruiseHeadCount);
        main(null);
    }
    public RevenueByEstablishment(){
        initComponents();
        
        
        
        
        
        //jLabel4.setText("Cruise Headcount - "+CruiseHeadCount);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Mode - Bus");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(121, 121, 121)
                .addComponent(jLabel2)
                .addGap(101, 101, 101)
                .addComponent(jLabel3)
                .addGap(168, 168, 168))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(335, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}