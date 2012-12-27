/* Copyright 2012 Malcolm Herring
 *
 * This is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * For a copy of the GNU General Public License, see <http://www.gnu.org/licenses/>.
 */

package symbols;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.*;
import java.util.ArrayList;

import symbols.Symbols.Instr;
import symbols.Symbols.Prim;

public class Harbours {
    public static final ArrayList<Instr> Anchor = new ArrayList<Instr>();
    static {
        Anchor.add(new Instr(Prim.BBOX, new Rectangle(-60,-60,120,120)));
        Anchor.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        Anchor.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-10,-59,20,20)));
        Path2D.Double p = new Path2D.Double(); p.moveTo(23.0,-40.0); p.lineTo(23.0,-30.0); p.lineTo(6.0,-30.0); p.lineTo(7.0,31.0); p.quadTo(21.0,29.0,31.0,22.0);
        p.lineTo(27.0,18.0); p.lineTo(52.0,0.0); p.lineTo(45.0,35.0); p.lineTo(37.0,28.0);	p.quadTo(25.0,39.0,7.0,43.0); p.lineTo(6.0,51.0);
        p.lineTo(-6.0,51.0); p.lineTo(-7.0,43.0);	p.quadTo(-25.0,39.0,-37.0,28.0); p.lineTo(-45.0,35.0); p.lineTo(-52.0,0.0); p.lineTo(-27.0,18.0);
        p.lineTo(-31.0,22.0); p.quadTo(-21.0,29.0,-7.0,31.0); p.lineTo(-6.0,-30.0); p.lineTo(-23.0,-30.0); p.lineTo(-23.0,-40.0); p.closePath();
        Anchor.add(new Instr(Prim.PGON, p));
    }
    public static final ArrayList<Instr> Yacht = new ArrayList<Instr>();
    static {
        Yacht.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        Path2D.Double p = new Path2D.Double(); p.moveTo(-65.0,50.0); p.curveTo(-36.0,97.0,36.0,97.0,65.0,50.0); p.lineTo(3.0,50.0); p.lineTo(3.0,40.0); p.lineTo(55.0,30.0);
        p.curveTo(32.0,4.0,25.0,-15.0,26.0,-52.0); p.lineTo(1.5,-40.0); p.lineTo(1.0,-64.0); p.lineTo(-2.0,-64.0); p.lineTo(-4.0,50.0); p.closePath();
        p.moveTo(-50.0,45.0); p.curveTo(-55.0,3.0,-37.0,-28.5,-7.0,-46.0); p.curveTo(-28.0,-15.0,-26.0,11.0,-20.5,30.0); p.closePath();
        Yacht.add(new Instr(Prim.PGON, p));
    }
    public static final ArrayList<Instr> Anchorage = new ArrayList<Instr>();
    static {
        Anchorage.add(new Instr(Prim.FILL, new Color(0xa30075)));
        Anchorage.add(new Instr(Prim.SYMB, new Symbols.Symbol(Harbours.Anchor, 1.0, 0, 0, null, null)));
    }
    public static final ArrayList<Instr> AnchorBerth = new ArrayList<Instr>();
    static {
        AnchorBerth.add(new Instr(Prim.SYMB, new Symbols.Symbol(Harbours.Anchorage, 1.0, 0, 0, null, null)));
        AnchorBerth.add(new Instr(Prim.STRK, new BasicStroke(2.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        AnchorBerth.add(new Instr(Prim.FILL, Color.white));
        Ellipse2D.Double s = new Ellipse2D.Double(-25,-25,50,50);
        AnchorBerth.add(new Instr(Prim.RSHP, s));
        AnchorBerth.add(new Instr(Prim.FILL, new Color(0xa30075)));
        AnchorBerth.add(new Instr(Prim.ELPS, s));
    }
    public static final ArrayList<Instr> Bollard = new ArrayList<Instr>();
    static {
        Bollard.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        Bollard.add(new Instr(Prim.FILL, Color.white));
        Ellipse2D.Double s = new Ellipse2D.Double(-10,-10,20,20);
        Bollard.add(new Instr(Prim.RSHP, s));
        Bollard.add(new Instr(Prim.FILL, Color.black));
        Bollard.add(new Instr(Prim.ELPS, s));
    }
    public static final ArrayList<Instr> ClearV = new ArrayList<Instr>();
    static {
        ClearV.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        ClearV.add(new Instr(Prim.FILL, Color.white));
        ClearV.add(new Instr(Prim.RSHP, new Ellipse2D.Double(-30,-30,60,60)));
        ClearV.add(new Instr(Prim.FILL, Color.black));
        ClearV.add(new Instr(Prim.LINE, new Line2D.Double(-10,-25,10,-25)));
        ClearV.add(new Instr(Prim.LINE, new Line2D.Double(0,-25,0,-15)));
        ClearV.add(new Instr(Prim.LINE, new Line2D.Double(-10,25,10,25)));
        ClearV.add(new Instr(Prim.LINE, new Line2D.Double(0,25,0,15)));
    }
    public static final ArrayList<Instr> ContainerCrane = new ArrayList<Instr>();
    static {
        ContainerCrane.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        ContainerCrane.add(new Instr(Prim.FILL, Color.black));
        ContainerCrane.add(new Instr(Prim.RSHP, new Rectangle2D.Double(-15,-65,30,100)));
        ContainerCrane.add(new Instr(Prim.RECT, new Rectangle2D.Double(-40,-12.5,80,25)));
    }
    public static final ArrayList<Instr> DeviationDolphin = new ArrayList<Instr>();
    static {
        DeviationDolphin.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        DeviationDolphin.add(new Instr(Prim.FILL, Color.black));
        Path2D.Double p = new Path2D.Double(); p.moveTo(-30.0,0.0); p.lineTo(30.0,0.0); p.moveTo(0.0,0.0); p.lineTo(0.0,-40.0);
        p.moveTo(-20.0,0.0); p.lineTo(-15.0,-32.0); p.lineTo(15.0,-32.0); p.lineTo(20.0,0.0);
        DeviationDolphin.add(new Instr(Prim.PLIN, p));
    }
    public static final ArrayList<Instr> DistanceI = new ArrayList<Instr>();
    static {
        DistanceI.add(new Instr(Prim.STRK, new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        DistanceI.add(new Instr(Prim.FILL, Color.black));
        DistanceI.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-11,-11,22,22)));
    }
    public static final ArrayList<Instr> DistanceU = new ArrayList<Instr>();
    static {
        DistanceU.add(new Instr(Prim.STRK, new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        DistanceU.add(new Instr(Prim.FILL, new Color(0xa30075)));
        DistanceU.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-11,-11,22,22)));
    }
    public static final ArrayList<Instr> Dolphin = new ArrayList<Instr>();
    static {
        Dolphin.add(new Instr(Prim.STRK, new BasicStroke(2.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        Dolphin.add(new Instr(Prim.FILL, new Color(0xffd400)));
        Path2D.Double p = new Path2D.Double(); p.moveTo(3.8,-9.2); p.lineTo(9.2,-3.8); p.lineTo(9.2,3.8); p.lineTo(3.8,9.2);
        p.lineTo(-3.8,9.2); p.lineTo(-9.2,3.8); p.lineTo(-9.2,-3.8); p.lineTo(-3.8,-9.2); p.closePath();
        Dolphin.add(new Instr(Prim.PGON, p));
        Dolphin.add(new Instr(Prim.FILL, Color.black));
        Dolphin.add(new Instr(Prim.PLIN, p));
    }
    public static final ArrayList<Instr> Harbour = new ArrayList<Instr>();
    static {
        Harbour.add(new Instr(Prim.STRK, new BasicStroke(15.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        Harbour.add(new Instr(Prim.FILL, new Color(0xa30075)));
        Harbour.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-75,-75,150,150)));
        Harbour.add(new Instr(Prim.SYMB, new Symbols.Symbol(Harbours.Anchor, 1.0, 0, 0, null, null)));
    }
    public static final ArrayList<Instr> HarbourMaster = new ArrayList<Instr>();
    static {
        HarbourMaster.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        HarbourMaster.add(new Instr(Prim.FILL, Color.black));
        HarbourMaster.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-35,-50,70,100)));
        HarbourMaster.add(new Instr(Prim.SYMB, new Symbols.Symbol(Harbours.Anchor, 0.6, 0, 0, null, null)));
    }
    public static final ArrayList<Instr> LandingSteps = new ArrayList<Instr>();
    static {
        LandingSteps.add(new Instr(Prim.FILL, new Color(0xa30075)));
        Path2D.Double p = new Path2D.Double(); p.moveTo(-20,-10); p.lineTo(10,20); p.lineTo(20,20); p.lineTo(20,10);
        p.lineTo(10,10); p.lineTo(10,0); p.lineTo(0,0); p.lineTo(0,-10); p.lineTo(-10,-10); p.lineTo(-10,-20); p.lineTo(-20,-20); p.closePath();
        LandingSteps.add(new Instr(Prim.PGON, p));
    }
    public static final ArrayList<Instr> Lock_Gate = new ArrayList<Instr>();
    public static final ArrayList<Instr> Lock = new ArrayList<Instr>();
    public static final ArrayList<Instr> Marina = new ArrayList<Instr>();
    static {
        Marina.add(new Instr(Prim.STRK, new BasicStroke(15.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        Marina.add(new Instr(Prim.FILL, new Color(0xa30075)));
        Marina.add(new Instr(Prim.SYMB, new Symbols.Symbol(Harbours.Yacht, 1.0, 0, 0, null, null)));
        Marina.add(new Instr(Prim.EARC, new Arc2D.Double(-80.0,-80.0,160.0,160.0,215.0,-250.0,Arc2D.OPEN)));
    }
    public static final ArrayList<Instr> MarinaNF = new ArrayList<Instr>();
    static {
        MarinaNF.add(new Instr(Prim.STRK, new BasicStroke(15.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        MarinaNF.add(new Instr(Prim.FILL, new Color(0xa30075)));
        MarinaNF.add(new Instr(Prim.SYMB, new Symbols.Symbol(Harbours.Yacht, 1.0, 0, 0, null, null)));
    }
    public static final ArrayList<Instr> PortCrane = new ArrayList<Instr>();
    static {
        PortCrane.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        PortCrane.add(new Instr(Prim.FILL, Color.black));
        PortCrane.add(new Instr(Prim.EARC, new Arc2D.Double(-36.0,-36.0,72.0,72.0,70.0,-320.0,Arc2D.OPEN)));
        PortCrane.add(new Instr(Prim.LINE, new Line2D.Double(0,0,0,-60)));
    }
    public static final ArrayList<Instr> Post = new ArrayList<Instr>();
    static {
        Post.add(new Instr(Prim.FILL, Color.black));
        Post.add(new Instr(Prim.RSHP, new Ellipse2D.Double(-10,-10,20,20)));
    }
    public static final ArrayList<Instr> SignalStation = new ArrayList<Instr>();
    static {
        SignalStation.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        SignalStation.add(new Instr(Prim.FILL, Color.black));
        SignalStation.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-25,-25,50,50)));
        SignalStation.add(new Instr(Prim.RSHP, new Ellipse2D.Double(-4,-4,8,8)));
    }
    public static final ArrayList<Instr> TideGauge = new ArrayList<Instr>();
    static {
        TideGauge.add(new Instr(Prim.STRK, new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        TideGauge.add(new Instr(Prim.FILL, Color.black));
        TideGauge.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-10,-10,20,20)));
        TideGauge.add(new Instr(Prim.LINE, new Line2D.Double(-10,0,-30,0)));
        TideGauge.add(new Instr(Prim.LINE, new Line2D.Double(10,0,30,0)));
        TideGauge.add(new Instr(Prim.LINE, new Line2D.Double(0,-10,0,-80)));
        TideGauge.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        TideGauge.add(new Instr(Prim.LINE, new Line2D.Double(-15,-25,15,-25)));
        TideGauge.add(new Instr(Prim.LINE, new Line2D.Double(-25,-45,25,-45)));
        TideGauge.add(new Instr(Prim.LINE, new Line2D.Double(-15,-65,15,-65)));
    }
}
