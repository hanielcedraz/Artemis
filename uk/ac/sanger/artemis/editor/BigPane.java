/*
 *
 * created: Wed Aug 3 2004
 *
 * This file is part of Artemis
 *
 * Copyright(C) 2000  Genome Research Limited
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or(at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 */

package uk.ac.sanger.artemis.editor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Font;
import java.util.Vector;

import javax.swing.*;

public class BigPane extends JFrame
{

  Font font = new Font("Monospaced",Font.PLAIN,12);
  protected static JCheckBoxMenuItem srsBrowser;
  protected static JCheckBoxMenuItem srsTabPane;
  protected static JCheckBoxMenuItem srsWin;
  protected static JInternalFrame srsFrame;

  public BigPane(String dataFile[])
  {
    super();

    setFont(font);
    JDesktopPane desktop = new JDesktopPane();
    desktop.setDragMode(JDesktopPane.LIVE_DRAG_MODE);
    getContentPane().add(desktop);

    //Make the big window be indented 100 pixels from each edge
    //of the screen.
    int inset = 100;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setBounds(inset, inset,
              screenSize.width  - inset*2,
              screenSize.height - inset*2);

    addWindowListener(new winExit());

    JMenuBar menuBar = createMenuBar(desktop);
    setJMenuBar(menuBar);

    // data set
    int hgt = getHeight()-60;
    int wid = (getWidth()/2)-400;
    DataViewInternalFrame dataView = new DataViewInternalFrame(dataFile,desktop);
    dataView.setLocation(wid,0);
    dataView.setSize(800,hgt);
    dataView.setVisible(true);
    desktop.add(dataView);

    setVisible(true);
  }

  private JMenuBar createMenuBar(final JDesktopPane desktop)
  {
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    menuBar.add(fileMenu);

    JMenuItem exitMenu = new JMenuItem("Exit");
    exitMenu.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.exit(0);
      }
    });
        
    fileMenu.add(exitMenu);

   //srs menu items
    JMenu optionMenu = new JMenu("Options");
    menuBar.add(optionMenu);

    JMenu srsMenu = new JMenu("Show SRS in");
    optionMenu.add(srsMenu);
    
    srsBrowser = new JCheckBoxMenuItem("Browser",false);
    srsTabPane = new JCheckBoxMenuItem("Tab Pane",true);
    srsWin     = new JCheckBoxMenuItem("New Window",false);

    srsMenu.add(srsBrowser);
    srsMenu.add(srsTabPane);
    srsMenu.add(srsWin);

   //drag mode
    JMenu dragMenu = new JMenu("Drag Mode");
    optionMenu.add(dragMenu);

    JRadioButtonMenuItem liveDrag = new JRadioButtonMenuItem("Live",true);
    liveDrag.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        desktop.setDragMode(JDesktopPane.LIVE_DRAG_MODE);
      }
    });

    dragMenu.add(liveDrag);

    JRadioButtonMenuItem outlineDrag = new JRadioButtonMenuItem("Outline",false);
    outlineDrag.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
      }
    });
    dragMenu.add(outlineDrag);
    ButtonGroup buttGroup = new ButtonGroup();
    buttGroup.add(liveDrag);
    buttGroup.add(outlineDrag);
      

    return menuBar;
  }

  
  protected static void setUpSRSFrame(int hgt, JDesktopPane desktop)
  {
    BigPane.srsFrame = new JInternalFrame("SRS",
                                           true, //resizable
                                           true, //closable
                                           true, //maximizable
                                           true);//iconifiable
    BigPane.srsFrame.setLocation(0,0);
    BigPane.srsFrame.setSize(500,hgt);
    final JTabbedPane jtab = new JTabbedPane();
    BigPane.srsFrame.getContentPane().add(jtab);

    JMenuBar menuBar = new JMenuBar();
    CommonMenu cmen = new CommonMenu(BigPane.srsFrame);
    menuBar.add(cmen);
    JMenuItem closeTabMenu = new JMenuItem("Close tab");
    cmen.add(closeTabMenu);
    closeTabMenu.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        int select = jtab.getSelectedIndex(); 
        if(select > -1)
          jtab.removeTabAt(select);
      }
    });

    BigPane.srsFrame.setJMenuBar(menuBar);
    desktop.add(BigPane.srsFrame);
  }

  /**
  *
  * Extends WindowAdapter to close window.
  *
  */
  class winExit extends WindowAdapter
  {
     public void windowClosing(WindowEvent we)
     {
       System.exit(0); 
     }
  }


  public static void main(String args[])
  {
    if(args.length < 1)
    {
      System.out.println("Usage:: java BigPane data_file");
      System.exit(0);
    }
    new BigPane(args);
  }
}
