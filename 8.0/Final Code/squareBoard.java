 

import javax.swing.*;
import java.awt.*;

public class squareBoard extends JButton
{
    private int x;
    private int y;
    private Boolean rightWall;           //will decide if it has a right wall  or not
    private Boolean leftWall;            //will decide if it has a left wall  or not
    private Boolean topWall;             //will decide if it has a top wall  or not
    private Boolean bottomWall;          //will decide if it has a bottom wall  or not
    private int borderWidth = 6;
    private String location;               //this will decide what is the name of the last position.
    private ImageIcon symbol;
    public squareBoard(int x, int y)
    {
        super();
        this.x = x;
        this.y = y;
        this.oneBorder();
        this.border();                                            //This will do the borders. Some are exception, which will be done later in different method.
        this.exceptionalBorder();
    }
    public void oneBorder()
    {
        setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.DARK_GRAY));
        this.topWall = false;
        this.bottomWall = false;
        this.leftWall = false;
        this.rightWall = false;
        this.location = "planeSquare";
        this.symbol = new ImageIcon(getClass().getResource("image/planeSquare.png"));
        this.setIcon(symbol);
    }
    public void border()
    {
        if(x == 0 )
        {
            if(y == 0 || y == 1 || y == 2 || y == 3 || y == 4 || y == 5 || y == 6 || y == 7 || y == 8 || y == 9 || y == 10 || y == 11 || y == 12 || y == 13 || y == 14 || y == 15 )
            {
                if( y==0)
                {
                    setBorder(BorderFactory.createMatteBorder(borderWidth, borderWidth, 1, 1, Color.DARK_GRAY));
                    this.topWall = true;
                    this.leftWall = true;
                    this.rightWall = false;
                    this.bottomWall = false;
                }
                else if(y == 15)
                {
                    setBorder(BorderFactory.createMatteBorder(borderWidth, 1, 1, borderWidth, Color.DARK_GRAY));
                    this.topWall = true;
                    this.rightWall = true;
                    this.bottomWall = false;
                    this.leftWall = false;
                }
                else if( y == 1)
                {
                    setBorder(BorderFactory.createMatteBorder(borderWidth, 1, 1, (borderWidth/2), Color.DARK_GRAY));
                    this.topWall = true;
                    this.rightWall = true;
                    this.leftWall = false;
                    this.bottomWall = false;
                }
                else if(y == 2)
                {
                    setBorder(BorderFactory.createMatteBorder(borderWidth, (borderWidth/2), 1, 1, Color.DARK_GRAY));
                    this.topWall = true;
                    this.rightWall = false;
                    this.leftWall = true;
                    this.bottomWall = false;
                }
                else if( y == 8)
                {
                    setBorder(BorderFactory.createMatteBorder(borderWidth, 1, 1, (borderWidth/2), Color.DARK_GRAY));
                    this.topWall = true;
                    this.rightWall = true;
                    this.leftWall = false;
                    this.bottomWall = false;
                }
                else if(y == 9)
                {
                    setBorder(BorderFactory.createMatteBorder(borderWidth, (borderWidth/2), 1, 1, Color.DARK_GRAY));
                    this.topWall = true;
                    this.rightWall = false;
                    this.leftWall = true;
                    this.bottomWall = false;
                }
                else if(y == 4)
                {
                    setBorder(BorderFactory.createMatteBorder(borderWidth, 1, (borderWidth/2), 1, Color.DARK_GRAY));
                    this.topWall = true;
                    this.rightWall = false;
                    this.leftWall = false;
                    this.bottomWall = true;
                }
                else if(y == 11)
                {
                    setBorder(BorderFactory.createMatteBorder(borderWidth, 1, (borderWidth/2), 1, Color.DARK_GRAY));
                    this.topWall = true;
                    this.rightWall = false;
                    this.leftWall = false;
                    this.bottomWall = true;
                }
                else{
                setBorder(BorderFactory.createMatteBorder(borderWidth, 1, 1, 1, Color.DARK_GRAY));
                this.topWall = true;
                this.rightWall = false;
                this.leftWall = false;
                this.bottomWall = false;}
            }
        }
        if(y == 0)
        {
            if( x == 1 || x == 2 || x == 3 || x == 4 || x == 5 || x == 6 || x == 7 || x == 8 || x == 9 || x == 10 || x == 11 || x == 12 || x == 13 || x == 14 || x == 15)
            {
                if(x == 15)
                {
                    setBorder(BorderFactory.createMatteBorder(1, borderWidth, borderWidth, 1, Color.DARK_GRAY));
                    this.leftWall = true;
                    this.bottomWall = true;
                    this.rightWall = false;
                    this.topWall = false;
                }
                else if(x == 5)
                {
                    setBorder(BorderFactory.createMatteBorder(1, borderWidth,(borderWidth/2),1, Color.DARK_GRAY));
                    this.leftWall = true;
                    this.bottomWall = true;
                    this.topWall = false;
                    this.rightWall = false;
                }
                else if(x==6)
                {
                    setBorder(BorderFactory.createMatteBorder((borderWidth/2), borderWidth,1,1, Color.DARK_GRAY));
                    this.leftWall = true;
                    this.bottomWall = false;
                    this.topWall = false;
                    this.rightWall = true;
                }
                else if(x==12)
                {
                    setBorder(BorderFactory.createMatteBorder(1, borderWidth,(borderWidth/2),1, Color.DARK_GRAY));
                    this.leftWall = true;
                    this.bottomWall = true;
                    this.topWall = false;
                    this.rightWall = false;
                }
                else if(x==13)
                {
                    setBorder(BorderFactory.createMatteBorder((borderWidth/2), borderWidth,1,1, Color.DARK_GRAY));
                    this.leftWall = true;
                    this.bottomWall = false;
                    this.topWall = false;
                    this.rightWall = true;
                }
                else if(x==3)
                {
                    setBorder(BorderFactory.createMatteBorder(1, borderWidth, 1, (borderWidth/2), Color.DARK_GRAY));
                    this.leftWall = true;
                    this.rightWall = true;
                    this.topWall = false;
                    this.bottomWall = false;
                }
                else{
                setBorder(BorderFactory.createMatteBorder(1, borderWidth, 1, 1, Color.DARK_GRAY));
                this.leftWall = true;
                this.rightWall = false;
                this.topWall = false;
                this.bottomWall = false;
                }
            }
        }
        if(y == 15)
        {
            if(x == 1 || x == 2 || x == 3 || x == 4 || x == 5 || x == 6 || x == 7 || x == 8 || x == 9 || x == 10 ||x == 11 || x == 12 || x == 13 || x == 14 || x == 15)
            {
                if(x == 15)
                {
                    setBorder(BorderFactory.createMatteBorder(1, 1, borderWidth, borderWidth, Color.DARK_GRAY));
                    this.rightWall = true;
                    this.bottomWall = true;
                    this.topWall = false;
                    this.leftWall = false;

                }
                else if(x==1)
                {
                    setBorder(BorderFactory.createMatteBorder(1, 1, (borderWidth/2), borderWidth, Color.DARK_GRAY));
                    this.rightWall = true;
                    this.bottomWall = true;
                    this.topWall = false;
                    this.leftWall = false;
                }
                else if(x==2)
                {
                    setBorder(BorderFactory.createMatteBorder((borderWidth/2), 1, 1, borderWidth, Color.DARK_GRAY));
                    this.rightWall = true;
                    this.bottomWall = true;
                    this.topWall = false;
                    this.leftWall = false;
                }
                else if(x==11)
                {
                    setBorder(BorderFactory.createMatteBorder(1, 1, (borderWidth/2), borderWidth, Color.DARK_GRAY));
                    this.rightWall = true;
                    this.bottomWall = true;
                    this.topWall = false;
                    this.leftWall = false;
                }
                else if(x==12)
                {
                    setBorder(BorderFactory.createMatteBorder((borderWidth/2), 1, 1, borderWidth, Color.DARK_GRAY));
                    this.rightWall = true;
                    this.bottomWall = true;
                    this.topWall = false;
                    this.leftWall = false;
                }
                else if(x==3)
                {
                    setBorder(BorderFactory.createMatteBorder(1, (borderWidth/2), 1, borderWidth, Color.DARK_GRAY));
                    this.rightWall = true;
                    this.leftWall = true;
                    this.topWall = false;
                    this.bottomWall = false;
                }
                else
                {
                    setBorder(BorderFactory.createMatteBorder(1, 1, 1, borderWidth, Color.DARK_GRAY));
                    this.rightWall = true;
                    this.leftWall = false;
                    this.topWall = false;
                    this.bottomWall = false;
                }
            }
        }
        if(x == 15)
        {
            if( y == 1 || y == 2 || y == 3 || y == 4 || y == 5 || y == 6 || y == 7 || y == 8 || y == 9 || y == 10 || y == 11 || y == 12 || y == 13 || y == 14 )
            {
                if(y==3)
                {
                    setBorder(BorderFactory.createMatteBorder(1, 1, borderWidth, (borderWidth/2), Color.DARK_GRAY));
                    this.bottomWall = true;
                    this.rightWall = true;
                    this.leftWall = false;
                    this.topWall = false;
                }
                else if(y==4)
                {
                    setBorder(BorderFactory.createMatteBorder(1, (borderWidth/2), borderWidth, 1, Color.DARK_GRAY));
                    this.bottomWall = true;
                    this.rightWall = true;
                    this.leftWall = false;
                    this.topWall = false;
                }
                else if(y==9)
                {
                    setBorder(BorderFactory.createMatteBorder(1, 1, borderWidth, (borderWidth/2), Color.DARK_GRAY));
                    this.bottomWall = true;
                    this.rightWall = true;
                    this.leftWall = false;
                    this.topWall = false;
                }
                else if(y==10)
                {
                    setBorder(BorderFactory.createMatteBorder(1, (borderWidth/2), borderWidth, 1, Color.DARK_GRAY));
                    this.bottomWall = true;
                    this.rightWall = true;
                    this.leftWall = false;
                    this.topWall = false;
                }

                else{
                setBorder(BorderFactory.createMatteBorder(1, 1, borderWidth, 1, Color.DARK_GRAY));
                this.bottomWall = true;
                this.rightWall = false;
                this.leftWall = false;
                this.topWall = false;
                }
            }
        }



    }
    public void exceptionalBorder()
    {
        if(x == 1 && y==4)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2), 1, 1, (borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
            this.topWall = true;
            this.location = "greenMoon";
            this.symbol = new ImageIcon(getClass().getResource("image/greenMoon.png"));
            this.setIcon(symbol);
        }
        else if(x==1 && y==5)
        {
            setBorder(BorderFactory.createMatteBorder(1, (borderWidth/2), 1, 1, Color.DARK_GRAY));
            this.leftWall = true;
            
        }
        else if(x==1 && y==10)
        {
            setBorder(BorderFactory.createMatteBorder(1, 1, 1, (borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
            
        }
        else if(x==1 && y==11)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2), (borderWidth/2), 1, 1, Color.DARK_GRAY));
            this.leftWall = true;
            this.topWall = true;
            this.location = "redMoon";
            this.symbol = new ImageIcon(getClass().getResource("image/redMoon.png"));
            this.setIcon(symbol);
        }
        else if(x==3 && y==14)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),1, 1, (borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
            this.topWall = true;
            this.location = "greenriangle";
            this.symbol = new ImageIcon(getClass().getResource("image/greenTriangle.png"));
            this.setIcon(symbol);
        }
        else if(x==2 && y==14)
        {
            setBorder(BorderFactory.createMatteBorder(1,1, (borderWidth/2), 1, Color.DARK_GRAY));
            this.bottomWall = true;
        }
        else if(x==3 && y==1)
        {
            setBorder(BorderFactory.createMatteBorder(1,(borderWidth/2), (borderWidth/2), 1, Color.DARK_GRAY));
            this.leftWall = true;
            this.bottomWall = true;
            this.location = "redTriangle";
            this.symbol = new ImageIcon(getClass().getResource("image/redTriangle.png"));
            this.setIcon(symbol);
        }
        else if(x==4 && y==1)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),1, 1, 1, Color.DARK_GRAY));
            this.topWall = true;
        }
        //
        else if(x == 4 && y == 9)
        {
            setBorder(BorderFactory.createMatteBorder(1,1, (borderWidth/2), (borderWidth/2), Color.DARK_GRAY));
            this.bottomWall = true;
            this.rightWall = true;
            this.location = "blueSaturn";
            this.symbol = new ImageIcon(getClass().getResource("image/blueSaturn.png"));
            this.setIcon(symbol);
        }
        else if(x==5 && y == 9)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),1, 1, 1, Color.DARK_GRAY));
            this.topWall = true;
        }
        else if(x == 4 && y == 10)
        {
            setBorder(BorderFactory.createMatteBorder(1,(borderWidth/2), 1, 1, Color.DARK_GRAY));
            this.leftWall = true;
        }
        //
        else if(x == 5 && y == 5)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),(borderWidth/2), 1, 1, Color.DARK_GRAY));
            this.leftWall = true;
            this.topWall = true;
            this.location = "yellowSaturn";
            this.symbol = new ImageIcon(getClass().getResource("image/yellowSaturn.png"));
            this.setIcon(symbol);
        }
        else if(x == 4 && y == 5)
        {
            setBorder(BorderFactory.createMatteBorder(1,1, (borderWidth/2), 1, Color.DARK_GRAY));
            this.bottomWall = true;
        }
        else if(x == 5 && y == 4)
        {
            setBorder(BorderFactory.createMatteBorder(1,1, 1, (borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
        }
        //
        else if(x == 6 && y == 3)
        {
            setBorder(BorderFactory.createMatteBorder(1,1, (borderWidth/2), (borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
            this.bottomWall = true;
            this.location = "blueStar";
            this.symbol = new ImageIcon(getClass().getResource("image/blueStar.png"));
            this.setIcon(symbol);
        }
        else if(x == 6 && y == 4)
        {
            setBorder(BorderFactory.createMatteBorder(1,(borderWidth/2), 1, 1, Color.DARK_GRAY));
            this.leftWall = true;
        }
        else if(x == 7 && y == 3)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),1,1,1, Color.DARK_GRAY));
            this.topWall = true;
        }
        //
        else if(x == 6 && y == 12)
        {
            setBorder(BorderFactory.createMatteBorder(1,(borderWidth/2),(borderWidth/2),1, Color.DARK_GRAY));
            this.leftWall = true;
            this.bottomWall = true;
            this.location = "yellowStar";
            this.symbol = new ImageIcon(getClass().getResource("image/yellowStar.png"));
            this.setIcon(symbol);
        }
        else if(x == 6 && y == 11)
        {
            setBorder(BorderFactory.createMatteBorder(1,1,1,(borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
        }
        else if(x == 7 && y == 12)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),1,1,1, Color.DARK_GRAY));
            this.topWall = true;
        }
        //
        else if(x == 8 && y == 2)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),1,1,(borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
            this.topWall = true;
            this.location = "multiColour";
            this.symbol = new ImageIcon(getClass().getResource("image/multiColour.png"));
            this.setIcon(symbol);
        }
        else if(x == 8 && y == 3)
        {
            setBorder(BorderFactory.createMatteBorder(1,(borderWidth/2),1,1, Color.DARK_GRAY));
            this.leftWall = true;
        }
        else if(x == 7 && y ==2)
        {
            setBorder(BorderFactory.createMatteBorder(1,1,(borderWidth/2),1, Color.DARK_GRAY));
            this.bottomWall = true;
        }
        //
        else if(x == 9 && y == 5)
        {
            setBorder(BorderFactory.createMatteBorder(1,(borderWidth/2),(borderWidth/2),1, Color.DARK_GRAY));
            this.bottomWall = true;
            this.leftWall = true;
            this.location = "greenSaturn";
            this.symbol = new ImageIcon(getClass().getResource("image/greenSaturn.png"));
            this.setIcon(symbol);
        }
        else if(x == 9 && y == 4)
        {
            setBorder(BorderFactory.createMatteBorder(1,1,1,(borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
        }
        else if(x == 10 && y ==5)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),1,1,1, Color.DARK_GRAY));
            this.topWall = true;
        }
        //
        else if(x == 10 && y == 1)
        {
            setBorder(BorderFactory.createMatteBorder(1,1,(borderWidth/2),(borderWidth/2), Color.DARK_GRAY));
            this.bottomWall = true;
            this.rightWall = true;
            this.location = "blueMoon";
            this.symbol = new ImageIcon(getClass().getResource("image/blueMoon.png"));
            this.setIcon(symbol);
        }
        else if(x == 11 && y == 1)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),1,1,1, Color.DARK_GRAY));
            this.topWall = true;
        }
        else if(x == 10 && y == 2)
        {
            setBorder(BorderFactory.createMatteBorder(1,(borderWidth/2),1,1, Color.DARK_GRAY));
            this.leftWall = true;
        }
        //
        else if(x == 10 && y == 11)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),(borderWidth/2),1,1, Color.DARK_GRAY));
            this.leftWall = true;
            this.topWall = true;
            this.location = "greenStar";
            this.symbol = new ImageIcon(getClass().getResource("image/greenStar.png"));
            this.setIcon(symbol);
        }
        else if(x == 9 && y==11)
        {
            setBorder(BorderFactory.createMatteBorder(1,1,(borderWidth/2),1, Color.DARK_GRAY));
            this.bottomWall = true;
        }
        else if(x == 10 && y == 10)
        {
            setBorder(BorderFactory.createMatteBorder(1,1,1,(borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
        }
        //
        else if(x == 11 && y == 13)
        {
            setBorder(BorderFactory.createMatteBorder(1,(borderWidth/2),(borderWidth/2),1, Color.DARK_GRAY));
            this.leftWall = true;
            this.bottomWall = true;
            this.location = "redSaturn";
            this.symbol = new ImageIcon(getClass().getResource("image/redSaturn.png"));
            this.setIcon(symbol);
        }
        else if(x == 11 && y == 12)
        {
            setBorder(BorderFactory.createMatteBorder(1,1,1,(borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
        }
        else if(x == 12 && y == 13)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),1,1,1, Color.DARK_GRAY));
            this.topWall = true;
        }
        //
        else if(x == 12 && y == 4)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),1,1,(borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
            this.topWall = true;
            this.location = "redStar";
            this.symbol = new ImageIcon(getClass().getResource("image/redStar.png"));
            this.setIcon(symbol);
        }
        else if(x == 11 && y == 4)
        {
            setBorder(BorderFactory.createMatteBorder(1,1,(borderWidth/2),1, Color.DARK_GRAY));
            this.bottomWall = true;
        }
        else if(x == 12 && y == 5)
        {
            setBorder(BorderFactory.createMatteBorder(1,(borderWidth/2),1,1, Color.DARK_GRAY));
            this.leftWall = true;
        }
        //
        else if(x == 12 && y == 10)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),1,1,(borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
            this.topWall = true;
            this.location = "blueTriangle";
            this.symbol = new ImageIcon(getClass().getResource("image/blueTriangle.png"));
            this.setIcon(symbol);
        }
        else if(x == 11 && y == 10)
        {
            setBorder(BorderFactory.createMatteBorder(1,1,(borderWidth/2),1, Color.DARK_GRAY));
            this.bottomWall = true;
        }
        else if(x == 12 && y == 11)
        {
            setBorder(BorderFactory.createMatteBorder(1,(borderWidth/2),1,1, Color.DARK_GRAY));
            this.leftWall = true;
        }
        //
        else if(x == 13 && y == 12)
        {
            setBorder(BorderFactory.createMatteBorder(1,1,(borderWidth/2),(borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
            this.bottomWall = true;
            this.location = "yellowMoon";
            this.symbol = new ImageIcon(getClass().getResource("image/yellowMoon.png"));
            this.setIcon(symbol);
        }
        else if(x == 13 && y == 13)
        {
            setBorder(BorderFactory.createMatteBorder(1,(borderWidth/2),1,1, Color.DARK_GRAY));
            this.leftWall= true;
        }
        else if(x == 14 && y == 12)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),1,1,1, Color.DARK_GRAY));
            this.topWall = true;
        }
        //
        else if(x == 14 && y == 6)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),(borderWidth/2),1,1, Color.DARK_GRAY));
            this.leftWall = true;
            this.topWall = true;
            this.location = "yellowTriangle";
            this.symbol = new ImageIcon(getClass().getResource("image/yellowTriangle.png"));
            this.setIcon(symbol);
        }
        else if(x == 13 && y == 6)
        {
            setBorder(BorderFactory.createMatteBorder(1,1,(borderWidth/2),1, Color.DARK_GRAY));
            this.bottomWall= true;
        }
        else if(x == 14 && y == 5)
        {
            setBorder(BorderFactory.createMatteBorder(1,1,1,(borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
        }
        //
        else if(x == 7 && y == 7)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),(borderWidth/2),0,0, Color.DARK_GRAY));
            this.leftWall = true;
            this.topWall = true;
            setBackground(Color.BLACK);
            setIcon(null);
        }
        else if(x == 6 && y == 7)
        {
            setBorder(BorderFactory.createMatteBorder(1,1,(borderWidth/2),1, Color.DARK_GRAY));
            this.bottomWall= true;
        }
        else if(x == 7 && y == 6)
        {
            setBorder(BorderFactory.createMatteBorder(1,1,1,(borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
        }
        //
        else if(x == 8 && y == 7)
        {
            setBorder(BorderFactory.createMatteBorder(0,(borderWidth/2),(borderWidth/2),0, Color.DARK_GRAY));
            this.leftWall = true;
            this.bottomWall = true;
            setBackground(Color.BLACK);
            setIcon(null);
        }
        else if(x == 9 && y == 7)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),1,1,1, Color.DARK_GRAY));
            this.topWall= true;
        }
        else if(x == 8 && y == 6)
        {
            setBorder(BorderFactory.createMatteBorder(1,1,1,(borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
        }
        //
        else if(x == 8 && y == 8)
        {
            setBorder(BorderFactory.createMatteBorder(0,0,(borderWidth/2),(borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
            this.bottomWall = true;
            setBackground(Color.BLACK);
            setIcon(null);
        }
        else if(x == 8 && y == 9)
        {
            setBorder(BorderFactory.createMatteBorder(1,(borderWidth/2),1,1, Color.DARK_GRAY));
            this.leftWall= true;
        }
        else if(x == 9 && y == 8)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),1,1,1, Color.DARK_GRAY));
            this.topWall = true;
        }
        //
        else if(x == 7 && y == 8)
        {
            setBorder(BorderFactory.createMatteBorder((borderWidth/2),0,0,(borderWidth/2), Color.DARK_GRAY));
            this.rightWall = true;
            this.topWall = true;
            setBackground(Color.BLACK);
            setIcon(null);
        }
        else if(x == 7 && y == 9)
        {
            setBorder(BorderFactory.createMatteBorder(1,(borderWidth/2),1,1, Color.DARK_GRAY));
            this.leftWall= true;
        }
        else if(x == 6 && y == 8)
        {
            setBorder(BorderFactory.createMatteBorder(1,1,(borderWidth/2),1, Color.DARK_GRAY));
            this.bottomWall = true;
        }

    }
}
