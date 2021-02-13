/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ldjet
 */
public class BlackJackGUI extends javax.swing.JFrame {

    private static String[] cardFace = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static String[] suit = {"D", "H", "S", "C"};
    
    private static ArrayList<String> DealersCards = new ArrayList<>();
    private static ArrayList<String> PlayersCards = new ArrayList<>();
    private static int PlayerTotal;
    private static int DealerTotal;
    private static int DealerAces; // Will be used - Aces low atm
    private static int PlayerAces;
    
    private int Balance = 0;
    private int Bet = 0;
    
    
    public BlackJackGUI() {
        initComponents();
        
        HitB.setVisible(false);
        StandB.setVisible(false);
        ClearB.setVisible(false);
        
        System.out.println(getCardValue("AH"));
        System.out.println(getCardValue("10H"));
        
        Random random = new Random();
    }
    
    private boolean IsNumber(String Num){
        
        try{
            Integer.parseInt(Num);
            return true;
        }catch(Exception e){
            return false;
        }
        
    }
    
    public int getCardValue(String Card) {

        String CardFFace = "" + Card.charAt(0);
        
        if (CardFFace.equals("1")) {
            CardFFace = "10";
        }
        
        int pos = 0;

        for (int i = 0; i < 13; i++) {

            if (cardFace[i].equals(CardFFace)) {
                pos = i;
                break;

            }

        }
        
        pos++;
        if(pos > 10){
            pos = 10;
        }else if(pos == 1){
            pos = 11;
            
        }
        return pos;
    }
    
    private String getCard(JLabel CardIcon) {

        Random random = new Random();

        String Card = cardFace[random.nextInt(13)] + suit[random.nextInt(4)];

        ImageIcon CardImg = new javax.swing.ImageIcon(getClass().getResource("cards\\" + Card + ".png"));

        CardIcon.setIcon(new ImageIcon(CardImg.getImage().getScaledInstance(53, 70, Image.SCALE_DEFAULT)));
        CardIcon.setText("");

        return Card;
    }
    
    public void UpdateBalance(int NewBalance){ // Only local sided to this game
        
        BalanceTitle.setText("Balance: "+NewBalance);
        Balance = NewBalance; // Not always used but :/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BalanceTitle = new javax.swing.JLabel();
        PlayersHandCards = new javax.swing.JLayeredPane();
        Card1 = new javax.swing.JLabel();
        Card2 = new javax.swing.JLabel();
        Card3 = new javax.swing.JLabel();
        Card4 = new javax.swing.JLabel();
        Card5 = new javax.swing.JLabel();
        Card6 = new javax.swing.JLabel();
        PlayersHandTitle = new javax.swing.JLabel();
        DealersHandCards = new javax.swing.JLayeredPane();
        Card7 = new javax.swing.JLabel();
        Card8 = new javax.swing.JLabel();
        Card9 = new javax.swing.JLabel();
        Card10 = new javax.swing.JLabel();
        Card11 = new javax.swing.JLabel();
        Card12 = new javax.swing.JLabel();
        DealersHandTitle = new javax.swing.JLabel();
        BetTitle = new javax.swing.JLabel();
        BetField = new javax.swing.JTextField();
        BetB = new javax.swing.JButton();
        HitB = new javax.swing.JButton();
        StandB = new javax.swing.JButton();
        StatusTitle = new javax.swing.JLabel();
        ReturnB = new javax.swing.JButton();
        ClearB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 309));
        setMinimumSize(new java.awt.Dimension(500, 309));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 309));

        BalanceTitle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        BalanceTitle.setForeground(new java.awt.Color(153, 0, 204));
        BalanceTitle.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        BalanceTitle.setText("Balance: 0");

        Card1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Card2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Card3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Card4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Card5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Card6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        PlayersHandCards.setLayer(Card1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PlayersHandCards.setLayer(Card2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PlayersHandCards.setLayer(Card3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PlayersHandCards.setLayer(Card4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PlayersHandCards.setLayer(Card5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        PlayersHandCards.setLayer(Card6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PlayersHandCardsLayout = new javax.swing.GroupLayout(PlayersHandCards);
        PlayersHandCards.setLayout(PlayersHandCardsLayout);
        PlayersHandCardsLayout.setHorizontalGroup(
            PlayersHandCardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayersHandCardsLayout.createSequentialGroup()
                .addComponent(Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Card3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Card4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Card5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Card6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PlayersHandCardsLayout.setVerticalGroup(
            PlayersHandCardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayersHandCardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Card3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Card4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Card5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Card6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PlayersHandTitle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        PlayersHandTitle.setForeground(new java.awt.Color(153, 0, 204));
        PlayersHandTitle.setText("Your hand:");

        Card7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Card8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Card9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Card10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Card11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Card12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        DealersHandCards.setLayer(Card7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DealersHandCards.setLayer(Card8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DealersHandCards.setLayer(Card9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DealersHandCards.setLayer(Card10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DealersHandCards.setLayer(Card11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        DealersHandCards.setLayer(Card12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DealersHandCardsLayout = new javax.swing.GroupLayout(DealersHandCards);
        DealersHandCards.setLayout(DealersHandCardsLayout);
        DealersHandCardsLayout.setHorizontalGroup(
            DealersHandCardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DealersHandCardsLayout.createSequentialGroup()
                .addComponent(Card7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Card8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Card9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Card10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Card11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Card12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DealersHandCardsLayout.setVerticalGroup(
            DealersHandCardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DealersHandCardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Card7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Card8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Card9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Card10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Card11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(Card12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DealersHandTitle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        DealersHandTitle.setForeground(new java.awt.Color(153, 0, 204));
        DealersHandTitle.setText("Dealers hand:");

        BetTitle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        BetTitle.setForeground(new java.awt.Color(153, 0, 204));
        BetTitle.setText("Bet:");

        BetField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BetField.setToolTipText("Enter Bet");
        BetField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        BetField.setMaximumSize(new java.awt.Dimension(185, 37));
        BetField.setMinimumSize(new java.awt.Dimension(185, 37));
        BetField.setPreferredSize(new java.awt.Dimension(185, 37));

        BetB.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        BetB.setText("Bet");
        BetB.setBorder(null);
        BetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BetBActionPerformed(evt);
            }
        });

        HitB.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        HitB.setText("Hit");
        HitB.setBorder(null);
        HitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitBActionPerformed(evt);
            }
        });

        StandB.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        StandB.setText("Stand");
        StandB.setBorder(null);
        StandB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StandBActionPerformed(evt);
            }
        });

        StatusTitle.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        StatusTitle.setForeground(new java.awt.Color(153, 0, 204));
        StatusTitle.setText(" ");

        ReturnB.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        ReturnB.setText("Return");
        ReturnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBActionPerformed(evt);
            }
        });

        ClearB.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        ClearB.setText("Clear");
        ClearB.setBorder(null);
        ClearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PlayersHandCards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PlayersHandTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DealersHandTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DealersHandCards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 118, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(HitB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(BetTitle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BetField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(StandB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BetB, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ClearB, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(StatusTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(BalanceTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ReturnB)))
                        .addGap(12, 12, 12))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(PlayersHandTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ReturnB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PlayersHandCards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(DealersHandTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DealersHandCards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HitB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BetTitle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StandB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BetB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StatusTitle)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ClearB)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BalanceTitle)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BetBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BetBActionPerformed

        JLabel[] DealersCardsJLabels = {Card7, Card8, Card9, Card10, Card11, Card12};
        JLabel[] PlayersCardsJLabels = {Card1, Card2, Card3, Card4, Card5, Card6};
        
        if(IsNumber(BetField.getText())){
            
            Bet = Integer.parseInt(BetField.getText());
            
            if(Bet > Balance){
                
                StatusTitle.setText("Insufficient coins");
            }else{
                
                StatusTitle.setText("");
                
                BetB.setVisible(false);
                BetField.setVisible(false);
                BetTitle.setVisible(false);
                HitB.setVisible(true);
                StandB.setVisible(true);
                
                for (int i = 1; i < DealersCardsJLabels.length; i++) {
                    JLabel CardLabel = (JLabel) DealersCardsJLabels[i];
                    
                    CardLabel.setVisible(false);
                }
                
                UpdateBalance(Balance - Bet);
                
                int DealerCardNum = 0;
                
                for (int i = 0; i < 2; i++) {
                    String newCard = getCard(PlayersCardsJLabels[PlayersCards.size()]);
        
                    PlayersCards.add(newCard);
                    
                    int CardValue = getCardValue(newCard);
                    
                    if(CardValue == 11){
                        PlayerAces++;
                    }
        
                    PlayerTotal = PlayerTotal + CardValue;
                }
                
                if (PlayerTotal > 21){ //If player recieved 2 aces as starting cards (rly lucky)
                    
                    PlayerAces--;
                    PlayerTotal = PlayerTotal - 10;
                }
                
                PlayersHandTitle.setText("Players hand: "+PlayerTotal);
                
                boolean Run = true;
                
                while(Run == true){
                 
                    if (DealerTotal < 17) {

                        String newCard = getCard(DealersCardsJLabels[DealerCardNum]);

                        DealersCards.add(newCard);
                        
                        DealerCardNum++;

                        int CardValue = getCardValue(newCard);

                        if (CardValue == 11) {
                            DealerAces++;
                        }
                        
                        DealerTotal = DealerTotal + CardValue;
                        System.out.println(DealerTotal);

                    } else {
                        
                        if (DealerTotal > 21) {

                            for (int i = 0; i < DealerAces; i++) {
                                DealerTotal = DealerTotal - 10;
                                DealerAces--;
                                if (DealerTotal <= 21) {
                                    break;
                                }
                            }

                        }

                        if (DealerTotal >= 17) {
                            Run = false;
                        }
                    }
                }
            }
        }else{
            StatusTitle.setText("Error: Invalid Bet.");
        }
    }//GEN-LAST:event_BetBActionPerformed

    private void ShowDealersCards(){
        
        JLabel[] DealersCardsJLabels = {Card7, Card8, Card9, Card10, Card11, Card12};
        
        for (int i = 0; i < DealersCardsJLabels.length; i++) {
            JLabel CardLabel = (JLabel) DealersCardsJLabels[i];
                    
            CardLabel.setVisible(true);
        }
        
        DealersHandTitle.setText("Dealers hand: "+DealerTotal);
        
    }
    
    private void HitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitBActionPerformed
        // Check if player bust
        
        JLabel[] PlayersCardsJLabels = {Card1, Card2, Card3, Card4, Card5, Card6};
        
        String newCard = getCard(PlayersCardsJLabels[PlayersCards.size()]);
        
        PlayersCards.add(newCard);
        
        int CardValue = getCardValue(newCard);

        if (CardValue == 11) {
            PlayerAces++;
        }

        PlayerTotal = PlayerTotal + CardValue;
        
        System.out.println(PlayerTotal);

        if(PlayerTotal > 21){
            for (int i = 0; i < PlayerAces; i++) {
                PlayerTotal = PlayerTotal - 10;
                PlayerAces--;
                if(PlayerTotal <= 21){
                    break;
                }
            }
            
            if(PlayerTotal > 21){
                EndGame("Lose", "You went bust!");
                return;
            }
        }
        
        PlayersHandTitle.setText("Players hand: "+PlayerTotal);
    }//GEN-LAST:event_HitBActionPerformed

    private void EndGame(String Result, String Message){
        
        String StartMessage = "";
        
        if (Result.equals("Win")){
            UpdateBalance(Balance + (Bet*2));
            StartMessage = "You won!";
        }else if(Result.equals("Lose")){
            StartMessage = "You lost!";
        }else if(Result.equals("Draw")){
            UpdateBalance(Balance + Bet);
            StartMessage = "You drew!";
        }
        
        PlayersHandTitle.setText("Players hand: "+PlayerTotal);
        
        ShowDealersCards();
        
        System.out.println(DealersCards.toString());
        
        StatusTitle.setText(StartMessage +" "+ Message);
        
        
        // CLEAR LISTS
        
        DealersCards = new ArrayList<>();
        PlayersCards = new ArrayList<>();
        PlayerTotal = 0;
        DealerTotal = 0;
        PlayerAces = 0;
        DealerAces = 0;
        
        // SHOW BET OPTIONS (moved to clear button)
        ClearB.setVisible(true);
        
        HitB.setVisible(false);
        StandB.setVisible(false);
    }

    
    private void StandBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StandBActionPerformed
        if ((DealerTotal == 21) && (PlayerTotal == 21)) {
            EndGame("Draw", "You both got blackjack!");
            // Draw - Both got blackjack
            
        }else if(PlayerTotal == 21){
            EndGame("Win", "You got blackjack!");
            // Win - Player got blackjack
        }else if(DealerTotal == 21){
            EndGame("Lose", "The dealer got blackjack!");
            // Lost - Dealer got blackjack
        }else if(DealerTotal > 21){
            EndGame("Win", "The dealer went bust!");
            // Win - Dealer bust
        }else if(DealerTotal == PlayerTotal){
            EndGame("Draw", "You both scored the same!");
            // Draw - Both got same
        }else if(DealerTotal > PlayerTotal){
            EndGame("Lose", "The dealer scored higher!");
            // Lost - Dealer higher
        }else if(PlayerTotal > DealerTotal){
            EndGame("Win", "You scored higher than the dealer");
            // Win - Player higher
        }
    }//GEN-LAST:event_StandBActionPerformed

    private void ReturnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBActionPerformed
        Casino.UnloadGames(Balance);
    }//GEN-LAST:event_ReturnBActionPerformed

    private void ClearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBActionPerformed
        JLabel[] PlayersCardsJLabels = {Card1, Card2, Card3, Card4, Card5, Card6};
        JLabel[] DealersCardsJLabels = {Card7, Card8, Card9, Card10, Card11, Card12};
        
        BetB.setVisible(true);
        BetField.setVisible(true);
        BetTitle.setVisible(true);
        ClearB.setVisible(false);
        
        StatusTitle.setText("");
        
        for (int i = 0; i < PlayersCardsJLabels.length; i++) {
            JLabel CardLabel = PlayersCardsJLabels[i];
            
            CardLabel.setIcon(null);
        }
        
        for (int i = 0; i < DealersCardsJLabels.length; i++) {
            JLabel CardLabel = (JLabel) DealersCardsJLabels[i];

            CardLabel.setIcon(null);
        }
        
        DealersHandTitle.setText("Dealers hand:");
        PlayersHandTitle.setText("Players hand:");
    }//GEN-LAST:event_ClearBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BlackJackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BlackJackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BlackJackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BlackJackGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BlackJackGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BalanceTitle;
    private javax.swing.JButton BetB;
    private javax.swing.JTextField BetField;
    private javax.swing.JLabel BetTitle;
    private javax.swing.JLabel Card1;
    private javax.swing.JLabel Card10;
    private javax.swing.JLabel Card11;
    private javax.swing.JLabel Card12;
    private javax.swing.JLabel Card2;
    private javax.swing.JLabel Card3;
    private javax.swing.JLabel Card4;
    private javax.swing.JLabel Card5;
    private javax.swing.JLabel Card6;
    private javax.swing.JLabel Card7;
    private javax.swing.JLabel Card8;
    private javax.swing.JLabel Card9;
    private javax.swing.JButton ClearB;
    private javax.swing.JLayeredPane DealersHandCards;
    private javax.swing.JLabel DealersHandTitle;
    private javax.swing.JButton HitB;
    private javax.swing.JLayeredPane PlayersHandCards;
    private javax.swing.JLabel PlayersHandTitle;
    private javax.swing.JButton ReturnB;
    private javax.swing.JButton StandB;
    private javax.swing.JLabel StatusTitle;
    // End of variables declaration//GEN-END:variables
}