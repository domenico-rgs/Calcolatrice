package lab.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lab.Model.Calcolatrice;
import lab.View.CalcGUI;

public class ControllerCalc {
	private CalcGUI gui;
	private Calcolatrice model;
	
	public ControllerCalc(CalcGUI view, Calcolatrice model) {
		gui=view;
		this.model=model;
		initComponents();
	}
	
	public void initComponents() {
		ActionListener num = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui.getOutput().setText(model.getNum(e.getActionCommand()));
			}
		};
		
		for(int i =0 ; i<gui.getNumber().length; i++) {
			gui.getNumber()[i].addActionListener(num);
		}
		
		ActionListener special = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.getOp(e.getActionCommand());
			}
		};
		
		for(int i=0; i<gui.getSpecial().length; i++) {
			gui.getSpecial()[i].addActionListener(special);
		}
		
		ActionListener uguale = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui.getOutput().setText(model.getDisplay());
			}
		};
		
		gui.getUguale().addActionListener(uguale);
		
		ActionListener clear = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.cancella();
				gui.getOutput().setText("0");
			}
		};
		
		gui.getCe().addActionListener(clear);
		
		ActionListener resetMem = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.resetMemory();
			}
		};
		
		gui.getMc().addActionListener(resetMem);
		
		ActionListener mplus = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addMem(gui.getOutput().getText());
			}
		};
		
		gui.getMplus().addActionListener(mplus);
		
		ActionListener mr = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gui.getOutput().setText(model.mR());
			}
		};
		
		gui.getMr().addActionListener(mr);
		
		
	}
	
}
