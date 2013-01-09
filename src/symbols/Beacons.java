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
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.EnumMap;

import symbols.Symbols.Instr;
import symbols.Symbols.Prim;

import s57.S57val.*;

public class Beacons {
    
    public static final ArrayList<Instr> Beacon = new ArrayList<Instr>();
    static {
        ArrayList<Instr> colours = new ArrayList<Instr>();
        Path2D.Double p = new Path2D.Double(); p.moveTo(-6.0,-8.5); p.lineTo(-6.0,-70.0); p.lineTo(6.0,-70.0); p.lineTo(6.0,-8.5); p.curveTo(6.0,-10.0,-6.0,-10.0,-6.0,-8.5); p.closePath();
        colours.add(new Instr(Prim.P1, p));
        p = new Path2D.Double(); p.moveTo(-6.0,-8.5); p.lineTo(-6.0,-40.0); p.lineTo(6.0,-40.0); p.lineTo(6.0,-8.5); p.curveTo(6.0,-10.0,-6.0,-10.0,-6.0,-8.5); p.closePath();
    colours.add(new Instr(Prim.H2, p));
        p = new Path2D.Double(); p.moveTo(-6.0,-30.0); p.lineTo(-6.0,-50.0); p.lineTo(6.0,-50.0); p.lineTo(6.0,-30.0); p.closePath();
    colours.add(new Instr(Prim.H3, p));
        p = new Path2D.Double(); p.moveTo(-6.0,-40.0); p.lineTo(-6.0,-55.0); p.lineTo(6.0,-55.0); p.lineTo(6.0,-40.0); p.closePath();
    colours.add(new Instr(Prim.H4, p));
        p = new Path2D.Double(); p.moveTo(-6.0,-25.0); p.lineTo(-6.0,-40.0); p.lineTo(6.0,-40.0); p.lineTo(6.0,-25.0); p.closePath();
    colours.add(new Instr(Prim.H5, p));
        p = new Path2D.Double(); p.moveTo(0.0,-70.0); p.lineTo(6.0,-70.0); p.lineTo(6.0,-8.5); p.quadTo(3.0,-9.3,0.0,-10.0); p.closePath();
    colours.add(new Instr(Prim.V2, p));
    Beacon.add(new Instr(Prim.COLR, colours));
    Beacon.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND)));
    Beacon.add(new Instr(Prim.FILL, Color.black));
    Beacon.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-10,-10,20,20)));
    Beacon.add(new Instr(Prim.LINE, new Line2D.Double(-20,0,-10,0)));
    Beacon.add(new Instr(Prim.LINE, new Line2D.Double(10,0,20,0)));
        p = new Path2D.Double(); p.moveTo(-6.0,-8.5); p.lineTo(-6.0,-70.0); p.lineTo(6.0,-70.0); p.lineTo(6.0,-8.5);
        Beacon.add(new Instr(Prim.PLIN, p));
    }
    public static final ArrayList<Instr> Cairn = new ArrayList<Instr>();
    static {
        Cairn.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND)));
        Cairn.add(new Instr(Prim.FILL, Color.black));
        Cairn.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-10,-10,20,20)));
        Cairn.add(new Instr(Prim.LINE, new Line2D.Double(-40,0,-10,0)));
        Cairn.add(new Instr(Prim.LINE, new Line2D.Double(10,0,40,0)));
        Cairn.add(new Instr(Prim.ELPS, new Ellipse2D.Double(3,-40,40,40)));
        Cairn.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-43,-40,40,40)));
        Cairn.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-18,-70,36,36)));
    }
    public static final ArrayList<Instr> FogSignal = new ArrayList<Instr>();
    static {
        FogSignal.add(new Instr(Prim.STRK, new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND)));
        FogSignal.add(new Instr(Prim.FILL, Color.black));
        FogSignal.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-10,-10,20,20)));
        FogSignal.add(new Instr(Prim.STRK, new BasicStroke(10.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND)));
        FogSignal.add(new Instr(Prim.FILL, new Color(0xd400d4)));
        FogSignal.add(new Instr(Prim.EARC, new Arc2D.Double(-120.0,-120.0,240.0,240.0,190.0,50.0,Arc2D.OPEN)));
        FogSignal.add(new Instr(Prim.EARC, new Arc2D.Double(-92.5,-92.5,185.0,185.0,190.0,50.0,Arc2D.OPEN)));
        FogSignal.add(new Instr(Prim.EARC, new Arc2D.Double(-65.0,-65.0,130.0,130.0,190.0,50.0,Arc2D.OPEN)));
    }
    public static final ArrayList<Instr> LightFlare = new ArrayList<Instr>();
    static {
        LightFlare.add(new Instr(Prim.RSHP, new Ellipse2D.Double(-3,-3,6,6)));
        Path2D.Double p = new Path2D.Double();
        p.moveTo(0.0,-25.0); p.lineTo(15.0,-95.0); p.curveTo(20.0,-123.0,-20.0,-123.0,-15.0,-95.0);
        p.closePath();
        LightFlare.add(new Instr(Prim.PGON, p));
    }
    public static final ArrayList<Instr> LightMajor = new ArrayList<Instr>();
    static {
        LightMajor.add(new Instr(Prim.FILL, Color.black));
        Path2D.Double p = new Path2D.Double(); p.setWindingRule(GeneralPath.WIND_NON_ZERO);
        p.moveTo(0.0,-7.0); p.curveTo(-9.3,-6.5,-9.3,6.5,0.0,7.0); p.curveTo(9.3,6.5,9.3,-6.5,0.0,-7.0); p.closePath();
        p.moveTo(0.0,-35.5); p.lineTo(8.0,-11.2); p.lineTo(33.5,-11.2); p.lineTo(12.8,4.0);
        p.lineTo(20.5,28.5); p.lineTo(0.0,13.0); p.lineTo(-20.5,28.5); p.lineTo(-12.8,4.0); p.lineTo(-33.5,-11.2); p.lineTo(-8.0,-11.2); p.closePath();
        LightMajor.add(new Instr(Prim.PGON, p));
    }
    public static final ArrayList<Instr> LightMinor = new ArrayList<Instr>();
    static {
        LightMinor.add(new Instr(Prim.FILL, Color.black));
        Path2D.Double p = new Path2D.Double(); p.moveTo(0.0,-26.5); p.lineTo(6.0,-8.4); p.lineTo(25.1,-8.4); p.lineTo(9.6,3.0);
        p.lineTo(15.4,21.4); p.lineTo(0.0,9.8); p.lineTo(-15.4,21.4); p.lineTo(-9.6,3.0); p.lineTo(-25.1,-8.4); p.lineTo(-6.0,-8.4); p.closePath();
        LightMinor.add(new Instr(Prim.PGON, p));
    }
    public static final ArrayList<Instr> PerchPort = new ArrayList<Instr>();
    static {
        PerchPort.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND)));
        PerchPort.add(new Instr(Prim.FILL, Color.black));
        PerchPort.add(new Instr(Prim.LINE, new Line2D.Double(-10,0,10,0)));
        PerchPort.add(new Instr(Prim.LINE, new Line2D.Double(0,0,0,-40)));
        PerchPort.add(new Instr(Prim.LINE, new Line2D.Double(25,-70,0,-40)));
        PerchPort.add(new Instr(Prim.LINE, new Line2D.Double(-25,-70,0,-40)));
    }
    public static final ArrayList<Instr> PerchStarboard = new ArrayList<Instr>();
    static {
        PerchStarboard.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND)));
        PerchStarboard.add(new Instr(Prim.FILL, Color.black));
        PerchStarboard.add(new Instr(Prim.LINE, new Line2D.Double(-10,0,10,0)));
        PerchStarboard.add(new Instr(Prim.LINE, new Line2D.Double(0,0,0,-70)));
        PerchStarboard.add(new Instr(Prim.LINE, new Line2D.Double(25,-40,0,-68.7)));
        PerchStarboard.add(new Instr(Prim.LINE, new Line2D.Double(-25,-40,0,-68.7)));
    }
    public static final ArrayList<Instr> RadarStation = new ArrayList<Instr>();
    static {
        RadarStation.add(new Instr(Prim.STRK, new BasicStroke(2.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND)));
        RadarStation.add(new Instr(Prim.FILL, new Color(0xd400d4)));
        RadarStation.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-125,-125,250,250)));
    }
    public static final ArrayList<Instr> Stake = new ArrayList<Instr>();
    static {
        Stake.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND)));
        Stake.add(new Instr(Prim.FILL, Color.black));
        Stake.add(new Instr(Prim.LINE, new Line2D.Double(0,0,0,-70)));
        ArrayList<Instr> colours = new ArrayList<Instr>();
        Path2D.Double p = new Path2D.Double(); p.moveTo(-2.0,0.0); p.lineTo(-2.0,-70.0); p.lineTo(2.0,-70.0); p.lineTo(2.0,0.0); p.closePath();
        colours.add(new Instr(Prim.P1, p));
        p = new Path2D.Double(); p.moveTo(-2.0,0.0); p.lineTo(-2.0,-35.0); p.lineTo(2.0,-35.0); p.lineTo(2.0,0.0); p.closePath();
        colours.add(new Instr(Prim.H2, p));
        p = new Path2D.Double(); p.moveTo(-2.0,-23.3); p.lineTo(-2.0,-46.7); p.lineTo(2.0,-46.7); p.lineTo(2.0,-23.3); p.closePath();
        colours.add(new Instr(Prim.H3, p));
        p = new Path2D.Double(); p.moveTo(-2.0,-35.0); p.lineTo(-2.0,-52.5); p.lineTo(2.0,-52.5); p.lineTo(2.0,-35.0); p.closePath();
        colours.add(new Instr(Prim.H4, p));
        p = new Path2D.Double(); p.moveTo(-2.0,-17.5); p.lineTo(-2.0,-35.0); p.lineTo(2.0,-35.0); p.lineTo(2.0,-17.5); p.closePath();
        colours.add(new Instr(Prim.H5, p));
        Stake.add(new Instr(Prim.COLR, colours));
        Stake.add(new Instr(Prim.FILL, Color.black));
        Stake.add(new Instr(Prim.LINE, new Line2D.Double(-10,0,10,0)));
    }
    public static final ArrayList<Instr> Tower = new ArrayList<Instr>();
    static {
        ArrayList<Instr> colours = new ArrayList<Instr>();
        Path2D.Double p = new Path2D.Double(); p.moveTo(-25.0,0.0); p.lineTo(-20.0,-70.0); p.lineTo(20.0,-70.0); p.lineTo(25.0,0.0); p.lineTo(10.0,0.0); p.curveTo(10.0,-13.3,-10.0,-13.3,-10.0,0.0); p.closePath();
        colours.add(new Instr(Prim.P1, p));
        p = new Path2D.Double(); p.moveTo(-25.0,0.0); p.lineTo(-22.5,-35.0); p.lineTo(22.5,-35.0); p.lineTo(25.0,0.0); p.lineTo(10.0,0.0); p.curveTo(10.0,-13.3,-10.0,-13.3,-10.0,0.0); p.closePath();
    colours.add(new Instr(Prim.H2, p));
        p = new Path2D.Double(); p.moveTo(-23.3,-23.3); p.lineTo(-21.7,-46.7); p.lineTo(21.7,-46.7); p.lineTo(23.3,-23.3); p.closePath();
    colours.add(new Instr(Prim.H3, p));
        p = new Path2D.Double(); p.moveTo(-22.5,-35.0); p.lineTo(-21.0,-52.5); p.lineTo(21.0,-52.5); p.lineTo(22.5,-35.0); p.closePath();
    colours.add(new Instr(Prim.H4, p));
        p = new Path2D.Double(); p.moveTo(-23.6,-17.5); p.lineTo(-22.5,-35.0); p.lineTo(22.5,-35.0); p.lineTo(23.6,-17.5); p.closePath();
    colours.add(new Instr(Prim.H5, p));
        p = new Path2D.Double(); p.moveTo(0.0,-70.0); p.lineTo(20.0,-70.0); p.lineTo(25.0,0.0); p.lineTo(10.0,0.0); p.quadTo(10.0,-10.0,0.0,-10.0); p.closePath();
    colours.add(new Instr(Prim.V2, p));
    Tower.add(new Instr(Prim.COLR, colours));
    Tower.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND)));
    Tower.add(new Instr(Prim.FILL, Color.black));
    Tower.add(new Instr(Prim.ELPS, new Ellipse2D.Double(-10,-10,20,20)));
    Tower.add(new Instr(Prim.LINE, new Line2D.Double(-35,0,-10,0)));
    Tower.add(new Instr(Prim.LINE, new Line2D.Double(10,0,35,0)));
        p = new Path2D.Double(); p.moveTo(-25.0,0.0); p.lineTo(-20.0,-70.0); p.lineTo(20.0,-70.0); p.lineTo(25.0,0.0);
        Tower.add(new Instr(Prim.PLIN, p));
    }
    public static final ArrayList<Instr> WithyPort = new ArrayList<Instr>();
    static {
        WithyPort.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND)));
        WithyPort.add(new Instr(Prim.FILL, Color.black));
        WithyPort.add(new Instr(Prim.LINE, new Line2D.Double(-10,0,10,0)));
        WithyPort.add(new Instr(Prim.LINE, new Line2D.Double(0,0,0,-70)));
        WithyPort.add(new Instr(Prim.LINE, new Line2D.Double(20,-60,0,-50)));
        WithyPort.add(new Instr(Prim.LINE, new Line2D.Double(-20,-60,0,-50)));
        WithyPort.add(new Instr(Prim.LINE, new Line2D.Double(30,-35,0,-21)));
        WithyPort.add(new Instr(Prim.LINE, new Line2D.Double(-30,-35,0,-21)));
    }
    public static final ArrayList<Instr> WithyStarboard = new ArrayList<Instr>();
    static {
        WithyStarboard.add(new Instr(Prim.STRK, new BasicStroke(4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND)));
        WithyStarboard.add(new Instr(Prim.FILL, Color.black));
        WithyStarboard.add(new Instr(Prim.LINE, new Line2D.Double(-10,0,10,0)));
        WithyStarboard.add(new Instr(Prim.LINE, new Line2D.Double(0,0,0,-70)));
        WithyStarboard.add(new Instr(Prim.LINE, new Line2D.Double(20,-50,0,-60)));
        WithyStarboard.add(new Instr(Prim.LINE, new Line2D.Double(-20,-50,0,-60)));
        WithyStarboard.add(new Instr(Prim.LINE, new Line2D.Double(30,-21,0,-35)));
        WithyStarboard.add(new Instr(Prim.LINE, new Line2D.Double(-30,-21,0,-35)));
    }
    
    public static final EnumMap<BcnSHP, ArrayList<Instr>> Shapes = new EnumMap<BcnSHP, ArrayList<Instr>>(BcnSHP.class);
    static {
        Shapes.put(BcnSHP.BCN_UNKN, Beacons.Beacon); Shapes.put(BcnSHP.BCN_STAK, Beacons.Stake); Shapes.put(BcnSHP.BCN_TOWR, Beacons.Tower);
        Shapes.put(BcnSHP.BCN_LATT, Beacons.Beacon); Shapes.put(BcnSHP.BCN_PILE, Beacons.Beacon); Shapes.put(BcnSHP.BCN_POLE, Beacons.Stake);
        Shapes.put(BcnSHP.BCN_CARN, Beacons.Cairn); Shapes.put(BcnSHP.BCN_BUOY, Beacons.Beacon); Shapes.put(BcnSHP.BCN_POST, Beacons.Stake);
    }
}
