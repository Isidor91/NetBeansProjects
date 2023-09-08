package timerapp;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.TimerTask;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.text.MaskFormatter;

public class firstWindow extends JPanel
{
   private JButton startBtn,stopBtn,colorBtn;  
   private ButtonGroup bgroup = new ButtonGroup();
   //final JTextField countDowntField = new JTextField();
   private secondWindow sw;
   final  JFormattedTextField onTimetField = new JFormattedTextField(), countDowntField = new JFormattedTextField();
   private Color c;
   private Date time = new Date();
   private Timer timer,timer1;
   private JLabel label;
   private JComboBox speed;
   private JScrollPane p1;
             
    public firstWindow() throws ParseException 
    { 
        setPreferredSize(new Dimension(500,300));
        
        startBtn = new JButton("Start");
        stopBtn = new JButton("Stop"); 
        colorBtn = new JButton("Choose Color");
        
        add(startBtn);
        add(stopBtn);
        add(colorBtn);
        
        JRadioButton onTimeBtn = new JRadioButton();
        onTimeBtn.setText("on time:");
                                   
        JRadioButton countDownBtn = new JRadioButton();
        countDownBtn.setText("countdown");
        countDownBtn.setSelected(true);
        
        
        JLabel colorLabel = new JLabel("No color selected.");
                 
        bgroup.add(onTimeBtn);
        bgroup.add(countDownBtn);
       
        add(onTimeBtn);
        add(countDownBtn);
        add(colorLabel);
        countDowntField.setColumns(8);                        
        add(countDowntField);
       
       
        MaskFormatter mask = new MaskFormatter("##:##:##");
        mask.setPlaceholderCharacter('0');
        mask.install(onTimetField);
        
        countDowntField.setValue(0);
       
        onTimetField.setColumns(8);

        add(onTimetField);
       
       startBtn.addActionListener(new ActionListener()
       {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                startBtn.setEnabled(false);
                colorBtn.setEnabled(false);
                if(countDownBtn.isSelected())
                {
                    
                    final java.util.Timer timer = new java.util.Timer();
                    timer.scheduleAtFixedRate(new TimerTask() {
                        int i = Integer.parseInt(countDowntField.getText());
                        public void run() {
                            System.out.println(i--);
                            if (i < 0) {
                                timer.cancel();
                                int delay = Integer.parseInt(speed.getSelectedItem().toString()); 
                               
                                sw = new secondWindow(c, delay);
       
                            }
                        }
                    }, 0, 1000);           
                }
                else if (onTimeBtn.isSelected())
                {
                    System.out.println("On time: " + onTimetField.getText());
                    LocalTime localTime = LocalTime.parse(onTimetField.getText());
                    final java.util.Timer timer = new java.util.Timer();
                    timer.scheduleAtFixedRate(new TimerTask() {
                       
                        long i = localTime.toNanoOfDay();
                        public void run() {
                            System.out.println(i);
                            timer.cancel();                             
                            int delay = Integer.parseInt(speed.getSelectedItem().toString());  
                            sw = new secondWindow(c, delay);            
                        }
                    }, 0, 1000);
                }
              }
        });
  
       colorBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                c = JColorChooser.showDialog(firstWindow.this,"Choose", Color.yellow);
                colorLabel.setText(c.toString());
            }
       });
       
       stopBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                sw.getFrame().dispatchEvent(new WindowEvent(sw.getFrame(), WindowEvent.WINDOW_CLOSING));
                startBtn.setEnabled(true);
                colorBtn.setEnabled(true);
            }
       });
 
       String[] strings = { "1", "2", "3", "4", "5" };
       speed = new JComboBox(strings);
       speed.setSelectedIndex(0);
       add(speed);

    }
}    

 

