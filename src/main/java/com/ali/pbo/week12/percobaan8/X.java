package com.ali.pbo.week12.percobaan8;

import java.awt.*;
import java.awt.event.*;

public class X extends Frame
{
    public static void main(String[] args)
    {
        X x = new X();
        x.pack();
        x.setVisible(true);
    }

    private int count;
    public X()
    {
        final Label l = new Label("Count = " + count);
        add(l, BorderLayout.SOUTH);
        add(
            new Button("Hello " + 1)
            {
                {
                    addActionListener(
                        new ActionListener()
                        {
                            public void actionPerformed(ActionEvent ev)
                            {
                                count++;
                                l.setText("Count = " + count);
                            }
                        }
                    );
                }
            }, BorderLayout.NORTH
        );
    }
}