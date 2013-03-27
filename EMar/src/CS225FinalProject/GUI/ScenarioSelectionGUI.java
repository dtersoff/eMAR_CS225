/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CS225FinalProject.GUI;

import CS225FinalProject.DataStructure.Scenario;
import CS225FinalProject.SimulationManager;
import CS225FinalProject.DataStructure.SimulationController;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Student practice version
 * @author Eric
 */
public class ScenarioSelectionGUI extends javax.swing.JFrame {

	private SimulationController controller = SimulationController
			.getInstance();

	private int scenarioIterator = 0;

        
        /**
         * this verifies that it loads the selected scenario properly.
         */
    @Override
    public void setVisible(boolean b) {
        super.setVisible(b);
        if(b){
            if(controller.getScenarios().size()>0)
            setSelectedScenarioInfo();
            else{
                JOptionPane.showMessageDialog(this, "This program does not have any Scenarios to select. Please contact your professor",null,JOptionPane.OK_OPTION);
                SimulationManager.state = SimulationManager.LOGIN_STATE;
            }
        }
    }
        
        
        

	/**
	 * Creates new form ScenarioSelectionGUI
	 */
	public ScenarioSelectionGUI(SimulationManager manager) {
		initComponents();
		setTitle("Scenario Selection");
		
                summarySetterV2.setText("");

		setLocation((getToolkit().getScreenSize().width - getWidth()) / 2,
				(getToolkit().getScreenSize().height - getHeight()) / 2);

		setAlwaysOnTop(true);
		//setSelectedScenarioInfo();
                
              
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextButton = new javax.swing.JButton();
        previosButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        scenarioDescriptionScrollPanel = new javax.swing.JScrollPane();
        scenarioDescriptionPanel = new javax.swing.JPanel();
        patientNameLabel = new javax.swing.JLabel();
        patientNameSetter = new javax.swing.JLabel();
        scenarioSummaryLabel = new javax.swing.JLabel();
        currentTimeLabel = new javax.swing.JLabel();
        timeSetter = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        summarySetterV2 = new javax.swing.JTextArea();
        startButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scenario Selection");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        getContentPane().add(nextButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 211, -1, -1));

        previosButton.setText("Previous");
        previosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previosButtonActionPerformed(evt);
            }
        });
        getContentPane().add(previosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 217, -1, -1));

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        titleLabel.setText("Select Scenenario");
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 11, -1, -1));

        scenarioDescriptionPanel.setBackground(new java.awt.Color(200, 200, 200));
        scenarioDescriptionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientNameLabel.setText("Patient Name:");
        scenarioDescriptionPanel.add(patientNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        patientNameSetter.setText("name");
        scenarioDescriptionPanel.add(patientNameSetter, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        scenarioSummaryLabel.setText("Scenario Summary:");
        scenarioDescriptionPanel.add(scenarioSummaryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        currentTimeLabel.setText("Time Limit:");
        scenarioDescriptionPanel.add(currentTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        timeSetter.setText("5:00PM");
        scenarioDescriptionPanel.add(timeSetter, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        summarySetterV2.setColumns(20);
        summarySetterV2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        summarySetterV2.setRows(5);
        jScrollPane1.setViewportView(summarySetterV2);

        scenarioDescriptionPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 510, 255));

        scenarioDescriptionScrollPanel.setViewportView(scenarioDescriptionPanel);

        getContentPane().add(scenarioDescriptionScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 61, 518, -1));

        startButton.setBackground(new java.awt.Color(0, 204, 0));
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        getContentPane().add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, -1, -1));

        logOutButton.setBackground(new java.awt.Color(255, 0, 0));
        logOutButton.setText("Logout");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 456, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void setSelectedScenarioInfo() {
		ArrayList<Scenario> scenarios = controller.getScenarios();
		patientNameSetter.setText(scenarios.get(scenarioIterator)
				.getPatientName());

		summarySetterV2.setEditable(true);
                summarySetterV2.setText(scenarios.get(scenarioIterator).getSummary());
                summarySetterV2.setEditable(false);
                if(scenarios.get(scenarioIterator).getTime()!=0)
                timeSetter.setText(scenarios.get(scenarioIterator).getTime()+ " Minutes");
                else
                    timeSetter.setText("No time limit");
		// timeSetter.setText(scenarios.get(scenarioIterator).get);
		SimulationManager.CURRENT_SCENARIO = scenarios.get(scenarioIterator);

	}

	private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {
		if (JOptionPane.showConfirmDialog(this,
				"Are You Sure You want to Log out?", null,
				JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
			// System.exit(0);
			controller.writeClassNames();
			controller.writeScenarios();
			controller.writeUsers();

			SimulationManager.state = SimulationManager.LOGIN_STATE;
		}
	}

	private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {

		SimulationManager.state = SimulationManager.SIMULATION_STATE;
	}

	private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		if (controller.getScenarios().size() == scenarioIterator + 1)
			scenarioIterator = 0;
		else
			scenarioIterator++;
		setSelectedScenarioInfo();
	}

 private void previosButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		if (-1 == scenarioIterator - 1)
			scenarioIterator = controller.getScenarios().size() - 1;
		else
			scenarioIterator--;
		setSelectedScenarioInfo();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/*
		 * Set the Nimbus look and feel
		 */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(
					ScenarioSelectionGUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(
					ScenarioSelectionGUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(
					ScenarioSelectionGUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(
					ScenarioSelectionGUI.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/*
		 * Create and display the form
		 */
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new ScenarioSelectionGUI(new SimulationManager())
						.setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentTimeLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel patientNameLabel;
    private javax.swing.JLabel patientNameSetter;
    private javax.swing.JButton previosButton;
    private javax.swing.JPanel scenarioDescriptionPanel;
    private javax.swing.JScrollPane scenarioDescriptionScrollPanel;
    private javax.swing.JLabel scenarioSummaryLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JTextArea summarySetterV2;
    private javax.swing.JLabel timeSetter;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
