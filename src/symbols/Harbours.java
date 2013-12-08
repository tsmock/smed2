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
import java.awt.geom.*;

import seamap.Renderer;
import symbols.Symbols.*;

public class Harbours {
    public static final Symbol Anchor = new Symbol();
    static {
        Anchor.add(new Instr(Prim.BBOX, new Rectangle2D.Double(-60,-60,120,120)));
        Anchor.add(new Instr(Prim.STRK, new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        Anchor.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-10,-59,20,20)));
        Path2D.Double p = new Path2D.Double(); p.moveTo(23.0,-40.0); p.lineTo(23.0,-30.0); p.lineTo(6.0,-30.0); p.lineTo(7.0,31.0); p.quadTo(21.0,29.0,31.0,22.0);
        p.lineTo(27.0,18.0); p.lineTo(52.0,0.0); p.lineTo(45.0,35.0); p.lineTo(37.0,28.0);	p.quadTo(25.0,39.0,7.0,43.0); p.lineTo(6.0,51.0);
        p.lineTo(-6.0,51.0); p.lineTo(-7.0,43.0);	p.quadTo(-25.0,39.0,-37.0,28.0); p.lineTo(-45.0,35.0); p.lineTo(-52.0,0.0); p.lineTo(-27.0,18.0);
        p.lineTo(-31.0,22.0); p.quadTo(-21.0,29.0,-7.0,31.0); p.lineTo(-6.0,-30.0); p.lineTo(-23.0,-30.0); p.lineTo(-23.0,-40.0); p.closePath();
        Anchor.add(new Instr(Prim.PGON, p));
    }
    public static final Symbol Yacht = new Symbol();
    static {
        Yacht.add(new Instr(Prim.STRK, new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        Path2D.Double p = new Path2D.Double(); p.moveTo(-65.0,50.0); p.curveTo(-36.0,97.0,36.0,97.0,65.0,50.0); p.lineTo(3.0,50.0); p.lineTo(3.0,40.0); p.lineTo(55.0,30.0);
        p.curveTo(32.0,4.0,25.0,-15.0,26.0,-52.0); p.lineTo(1.5,-40.0); p.lineTo(1.0,-64.0); p.lineTo(-2.0,-64.0); p.lineTo(-4.0,50.0); p.closePath();
        p.moveTo(-50.0,45.0); p.curveTo(-55.0,3.0,-37.0,-28.5,-7.0,-46.0); p.curveTo(-28.0,-15.0,-26.0,11.0,-20.5,30.0); p.closePath();
        Yacht.add(new Instr(Prim.PGON, p));
    }
    public static final Symbol Anchorage = new Symbol();
    static {
        Anchorage.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Harbours.Anchor, 1.0, 0, 0, new Scheme(Renderer.Msymb), null)));
    }
    public static final Symbol Bollard = new Symbol();
    static {
        Bollard.add(new Instr(Prim.STRK, new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        Bollard.add(new Instr(Prim.FILL, Color.white));
        Ellipse2D.Double s = new Ellipse2D.Double(-10,-10,20,20);
        Bollard.add(new Instr(Prim.RSHP, s));
        Bollard.add(new Instr(Prim.FILL, Color.black));
        Bollard.add(new Instr(Prim.ELPS, s));
    }
    public static final Symbol ContainerCrane = new Symbol();
    static {
        ContainerCrane.add(new Instr(Prim.STRK, new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        ContainerCrane.add(new Instr(Prim.RSHP, new Rectangle2D.Double(-15,-65,30,100)));
        ContainerCrane.add(new Instr(Prim.RECT, new Rectangle2D.Double(-40,-12.5,80,25)));
    }
    public static final Symbol Customs = new Symbol();
    static {
        Customs.add(new Instr(Prim.BBOX, new Rectangle2D.Double(-30,-30,60,60)));
        Customs.add(new Instr(Prim.STRK, new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER)));
        Customs.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-28,-28,56,56)));
        Customs.add(new Instr(Prim.LINE, new Line2D.Double(-25,5,25,5)));
        Customs.add(new Instr(Prim.LINE, new Line2D.Double(-25,-5,25,-5)));
    }
    public static final Symbol DeviationDolphin = new Symbol();
    static {
        DeviationDolphin.add(new Instr(Prim.STRK, new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        Path2D.Double p = new Path2D.Double(); p.moveTo(-30.0,0.0); p.lineTo(30.0,0.0); p.moveTo(0.0,0.0); p.lineTo(0.0,-40.0);
        p.moveTo(-20.0,0.0); p.lineTo(-15.0,-32.0); p.lineTo(15.0,-32.0); p.lineTo(20.0,0.0);
        DeviationDolphin.add(new Instr(Prim.PLIN, p));
    }
    public static final Symbol DistanceI = new Symbol();
    static {
        DistanceI.add(new Instr(Prim.STRK, new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        DistanceI.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-11,-11,22,22)));
    }
    public static final Symbol DistanceU = new Symbol();
    static {
        DistanceU.add(new Instr(Prim.STRK, new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        DistanceU.add(new Instr(Prim.FILL, Renderer.Msymb));
        DistanceU.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-11,-11,22,22)));
    }
    public static final Symbol Dolphin = new Symbol();
    static {
        Dolphin.add(new Instr(Prim.STRK, new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        Dolphin.add(new Instr(Prim.FILL, new Color(0xffd400)));
        Path2D.Double p = new Path2D.Double(); p.moveTo(3.8,-9.2); p.lineTo(9.2,-3.8); p.lineTo(9.2,3.8); p.lineTo(3.8,9.2);
        p.lineTo(-3.8,9.2); p.lineTo(-9.2,3.8); p.lineTo(-9.2,-3.8); p.lineTo(-3.8,-9.2); p.closePath();
        Dolphin.add(new Instr(Prim.PGON, p));
        Dolphin.add(new Instr(Prim.FILL, Color.black));
        Dolphin.add(new Instr(Prim.PLIN, p));
    }
    public static final Symbol Explosives = new Symbol();
    static {
        Explosives.add(new Instr(Prim.BBOX, new Rectangle2D.Double(-30,-30,60,60)));
        Explosives.add(new Instr(Prim.RSHP, new Ellipse2D.Double(-5,25,10,10)));
        Explosives.add(new Instr(Prim.STRK, new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND)));
        Path2D.Double p = new Path2D.Double(); p.moveTo(-10,20); p.lineTo(-13,17); p.lineTo(-13,8);
        p.moveTo(0,10); p.lineTo(0,0); p.lineTo(-8,-10);
        p.moveTo(10,17); p.lineTo(18,-10); p.lineTo(10,-20);
        Explosives.add(new Instr(Prim.PLIN, p));
    }
    public static final Symbol Fishing = new Symbol();
    static {
        Fishing.add(new Instr(Prim.STRK, new BasicStroke(15, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        Fishing.add(new Instr(Prim.FILL, Renderer.Msymb));
        Fishing.add(new Instr(Prim.EARC, new Arc2D.Double(-75,-75,150,150,15,140,Arc2D.OPEN)));
        Fishing.add(new Instr(Prim.EARC, new Arc2D.Double(-75,-75,150,150,-15,-140,Arc2D.OPEN)));
        Path2D.Double p = new Path2D.Double(); p.setWindingRule(GeneralPath.WIND_EVEN_ODD);
        p.moveTo(-40,5); p.curveTo(20,40,50,25,80,0); p.curveTo(50,-25,20,-40,-40,-5);
        p.lineTo(-75,-25); p.quadTo(-80, 0, -75, 25); p.closePath();
        p.moveTo(42, 0); p.curveTo(42, 10, 56, 10, 56, 0); p.curveTo(56, -10, 42, -10, 42, 0); p.closePath();
        Fishing.add(new Instr(Prim.PGON, p));
    }
    public static final Symbol Harbour = new Symbol();
    static {
        Harbour.add(new Instr(Prim.STRK, new BasicStroke(15, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        Harbour.add(new Instr(Prim.FILL, Renderer.Msymb));
        Harbour.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-75,-75,150,150)));
        Harbour.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Harbours.Anchor, 1.0, 0, 0, new Scheme(Renderer.Msymb), null)));
    }
    public static final Symbol HarbourMaster = new Symbol();
    static {
        HarbourMaster.add(new Instr(Prim.BBOX, new Rectangle2D.Double(-30,-30,60,60)));
        HarbourMaster.add(new Instr(Prim.STRK, new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        HarbourMaster.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-24,-28,48,56)));
        HarbourMaster.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Harbours.Anchor, 0.4, 0, 0, null, null)));
    }
    public static final Symbol Hospital = new Symbol();
    static {
        Hospital.add(new Instr(Prim.BBOX, new Rectangle2D.Double(-30,-30,60,60)));
        Hospital.add(new Instr(Prim.STRK, new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER)));
        Hospital.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-28,-28,56,56)));
        Path2D.Double p = new Path2D.Double(); p.moveTo(-26,-5); p.lineTo(-5,-5); p.lineTo(-5,-25); p.moveTo(5,-25); p.lineTo(5,-5); p.lineTo(25,-5);
        p.moveTo(-25,5); p.lineTo(-5,5); p.lineTo(-5,25); p.moveTo(5,25); p.lineTo(5,5); p.lineTo(25,5);
        Hospital.add(new Instr(Prim.PLIN, p));
    }
    public static final Symbol LandingSteps = new Symbol();
    static {
        LandingSteps.add(new Instr(Prim.FILL, Renderer.Msymb));
        Path2D.Double p = new Path2D.Double(); p.moveTo(-20,-10); p.lineTo(10,20); p.lineTo(20,20); p.lineTo(20,10);
        p.lineTo(10,10); p.lineTo(10,0); p.lineTo(0,0); p.lineTo(0,-10); p.lineTo(-10,-10); p.lineTo(-10,-20); p.lineTo(-20,-20); p.closePath();
        LandingSteps.add(new Instr(Prim.PGON, p));
    }
    public static final Symbol Lock_Gate = new Symbol();
    public static final Symbol Lock = new Symbol();
    public static final Symbol Marina = new Symbol();
    static {
        Marina.add(new Instr(Prim.STRK, new BasicStroke(15, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        Marina.add(new Instr(Prim.FILL, Renderer.Msymb));
        Marina.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Harbours.Yacht, 1.0, 0, 0, new Scheme(Renderer.Msymb), null)));
        Marina.add(new Instr(Prim.EARC, new Arc2D.Double(-80.0,-80.0,160.0,160.0,215.0,-250.0,Arc2D.OPEN)));
    }
    public static final Symbol MarinaNF = new Symbol();
    static {
        MarinaNF.add(new Instr(Prim.STRK, new BasicStroke(15, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        MarinaNF.add(new Instr(Prim.SYMB, new Symbols.SubSymbol(Harbours.Yacht, 1.0, 0, 0, new Scheme(Renderer.Msymb), null)));
    }
    public static final Symbol Pilot = new Symbol();
    static{
        Pilot.add(new Instr(Prim.STRK, new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        Pilot.add(new Instr(Prim.FILL, new Color(0xd400d4)));
        Path2D.Double p = new Path2D.Double(); p.moveTo(-15,0); p.lineTo(0,-56); p.lineTo(15,0); p.lineTo(0,56); p.closePath();
        Pilot.add(new Instr(Prim.PGON, p));
        Pilot.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-58,-58,116,116)));
    }
    public static final Symbol PortCrane = new Symbol();
    static {
        PortCrane.add(new Instr(Prim.STRK, new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        PortCrane.add(new Instr(Prim.EARC, new Arc2D.Double(-36.0,-36.0,72.0,72.0,70.0,-320.0,Arc2D.OPEN)));
        PortCrane.add(new Instr(Prim.LINE, new Line2D.Double(0,0,0,-60)));
    }
    public static final Symbol Post = new Symbol();
    static {
        Post.add(new Instr(Prim.RSHP, new Ellipse2D.Double(-10,-10,20,20)));
    }
    public static final Symbol Rescue = new Symbol();
    static{
        Rescue.add(new Instr(Prim.STRK, new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        Path2D.Double p = new Path2D.Double(); p.moveTo(-11,0); p.lineTo(0,-43); p.lineTo(11,0); p.lineTo(0,43); p.closePath();
        Rescue.add(new Instr(Prim.PGON, p));
        Rescue.add(new Instr(Prim.LINE, new Line2D.Double(-15,0,15,0)));
    }
    public static final Symbol SignalStation = new Symbol();
    static {
        SignalStation.add(new Instr(Prim.STRK, new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        SignalStation.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-25,-25,50,50)));
        SignalStation.add(new Instr(Prim.RSHP, new Ellipse2D.Double(-4,-4,8,8)));
    }
    public static final Symbol TideGauge = new Symbol();
    static {
        TideGauge.add(new Instr(Prim.STRK, new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        TideGauge.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-10,-10,20,20)));
        TideGauge.add(new Instr(Prim.LINE, new Line2D.Double(-10,0,-30,0)));
        TideGauge.add(new Instr(Prim.LINE, new Line2D.Double(10,0,30,0)));
        TideGauge.add(new Instr(Prim.LINE, new Line2D.Double(0,-10,0,-80)));
        TideGauge.add(new Instr(Prim.STRK, new BasicStroke(4, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER)));
        TideGauge.add(new Instr(Prim.LINE, new Line2D.Double(-15,-25,15,-25)));
        TideGauge.add(new Instr(Prim.LINE, new Line2D.Double(-25,-45,25,-45)));
        TideGauge.add(new Instr(Prim.LINE, new Line2D.Double(-15,-65,15,-65)));
    }
}
