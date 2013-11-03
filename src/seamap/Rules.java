/* Copyright 2013 Malcolm Herring
 *
 * This is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * For a copy of the GNU General Public License, see <http://www.gnu.org/licenses/>.
 */

package seamap;

import java.awt.Color;
import java.awt.Font;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;

import s57.S57val.*;
import s57.S57att.*;
import s57.S57obj.*;
import seamap.Renderer.*;
import seamap.SeaMap.*;
import symbols.*;
import symbols.Symbols.*;

public class Rules {

    static SeaMap map;
    static int zoom;
    
    public static final Color Yland = new Color(0x50b0ff);
    public static final Color Mline = new Color(0x80c480);
    public static final Color Msymb = new Color(0xa30075);
    
    public static void rules (SeaMap m, int z) {
        map = m;
        zoom = z;
        ArrayList<Feature> objects;
        if ((objects = map.features.get(Obj.SLCONS)) != null) for (Feature feature : objects) shoreline(feature);
        if ((objects = map.features.get(Obj.PIPSOL)) != null) for (Feature feature : objects) pipelines(feature);
        if ((objects = map.features.get(Obj.CBLSUB)) != null) for (Feature feature : objects) cables(feature);
        if ((objects = map.features.get(Obj.PIPOHD)) != null) for (Feature feature : objects) pipelines(feature);
        if ((objects = map.features.get(Obj.CBLOHD)) != null) for (Feature feature : objects) cables(feature);
        if ((objects = map.features.get(Obj.TSEZNE)) != null) for (Feature feature : objects) separation(feature);
        if ((objects = map.features.get(Obj.TSSCRS)) != null) for (Feature feature : objects) separation(feature);
        if ((objects = map.features.get(Obj.TSSRON)) != null) for (Feature feature : objects) separation(feature);
        if ((objects = map.features.get(Obj.TSELNE)) != null) for (Feature feature : objects) separation(feature);
        if ((objects = map.features.get(Obj.TSSLPT)) != null) for (Feature feature : objects) separation(feature);
        if ((objects = map.features.get(Obj.TSSBND)) != null) for (Feature feature : objects) separation(feature);
        if ((objects = map.features.get(Obj.ISTZNE)) != null) for (Feature feature : objects) separation(feature);
        if ((objects = map.features.get(Obj.SNDWAV)) != null) for (Feature feature : objects) areas(feature);
        if ((objects = map.features.get(Obj.OSPARE)) != null) for (Feature feature : objects) areas(feature);
        if ((objects = map.features.get(Obj.FAIRWY)) != null) for (Feature feature : objects) areas(feature);
        if ((objects = map.features.get(Obj.DRGARE)) != null) for (Feature feature : objects) areas(feature);
        if ((objects = map.features.get(Obj.RESARE)) != null) for (Feature feature : objects) areas(feature);
        if ((objects = map.features.get(Obj.SPLARE)) != null) for (Feature feature : objects) areas(feature);
        if ((objects = map.features.get(Obj.SEAARE)) != null) for (Feature feature : objects) areas(feature);
        if ((objects = map.features.get(Obj.OBSTRN)) != null) for (Feature feature : objects) obstructions(feature);
        if ((objects = map.features.get(Obj.UWTROC)) != null) for (Feature feature : objects) obstructions(feature);
        if ((objects = map.features.get(Obj.MARCUL)) != null) for (Feature feature : objects) areas(feature);
        if ((objects = map.features.get(Obj.WTWAXS)) != null) for (Feature feature : objects) waterways(feature);
        if ((objects = map.features.get(Obj.RECTRC)) != null) for (Feature feature : objects) transits(feature);
        if ((objects = map.features.get(Obj.NAVLNE)) != null) for (Feature feature : objects) transits(feature);
        if ((objects = map.features.get(Obj.HRBFAC)) != null) for (Feature feature : objects) harbours(feature);
        if ((objects = map.features.get(Obj.ACHARE)) != null) for (Feature feature : objects) harbours(feature);
        if ((objects = map.features.get(Obj.ACHBRT)) != null) for (Feature feature : objects) harbours(feature);
        if ((objects = map.features.get(Obj.BERTHS)) != null) for (Feature feature : objects) harbours(feature);
        if ((objects = map.features.get(Obj.LOKBSN)) != null) for (Feature feature : objects) locks(feature);
        if ((objects = map.features.get(Obj.LKBSPT)) != null) for (Feature feature : objects) locks(feature);
        if ((objects = map.features.get(Obj.GATCON)) != null) for (Feature feature : objects) locks(feature);
        if ((objects = map.features.get(Obj.DISMAR)) != null) for (Feature feature : objects) distances(feature);
        if ((objects = map.features.get(Obj.HULKES)) != null) for (Feature feature : objects) ports(feature);
        if ((objects = map.features.get(Obj.CRANES)) != null) for (Feature feature : objects) ports(feature);
        if ((objects = map.features.get(Obj.LNDMRK)) != null) for (Feature feature : objects) landmarks(feature);
        if ((objects = map.features.get(Obj.BUISGL)) != null) for (Feature feature : objects) harbours(feature);
        if ((objects = map.features.get(Obj.MORFAC)) != null) for (Feature feature : objects) moorings(feature);
        if ((objects = map.features.get(Obj.NOTMRK)) != null) for (Feature feature : objects) notices(feature);
        if ((objects = map.features.get(Obj.SMCFAC)) != null) for (Feature feature : objects) marinas(feature);
        if ((objects = map.features.get(Obj.BRIDGE)) != null) for (Feature feature : objects) bridges(feature);
        if ((objects = map.features.get(Obj.LITMAJ)) != null) for (Feature feature : objects) lights(feature);
        if ((objects = map.features.get(Obj.LITMIN)) != null) for (Feature feature : objects) lights(feature);
        if ((objects = map.features.get(Obj.LIGHTS)) != null) for (Feature feature : objects) lights(feature);
        if ((objects = map.features.get(Obj.SISTAT)) != null) for (Feature feature : objects) stations(feature);
        if ((objects = map.features.get(Obj.SISTAW)) != null) for (Feature feature : objects) stations(feature);
        if ((objects = map.features.get(Obj.CGUSTA)) != null) for (Feature feature : objects) stations(feature);
        if ((objects = map.features.get(Obj.RDOSTA)) != null) for (Feature feature : objects) stations(feature);
        if ((objects = map.features.get(Obj.RADSTA)) != null) for (Feature feature : objects) stations(feature);
        if ((objects = map.features.get(Obj.RSCSTA)) != null) for (Feature feature : objects) stations(feature);
        if ((objects = map.features.get(Obj.PILBOP)) != null) for (Feature feature : objects) stations(feature);
        if ((objects = map.features.get(Obj.WTWGAG)) != null) for (Feature feature : objects) gauges(feature);
        if ((objects = map.features.get(Obj.OFSPLF)) != null) for (Feature feature : objects) platforms(feature);
        if ((objects = map.features.get(Obj.WRECKS)) != null) for (Feature feature : objects) wrecks(feature);
        if ((objects = map.features.get(Obj.LITVES)) != null) for (Feature feature : objects) floats(feature);
        if ((objects = map.features.get(Obj.LITFLT)) != null) for (Feature feature : objects) floats(feature);
        if ((objects = map.features.get(Obj.BOYINB)) != null) for (Feature feature : objects) floats(feature);
        if ((objects = map.features.get(Obj.BOYLAT)) != null) for (Feature feature : objects) buoys(feature);
        if ((objects = map.features.get(Obj.BOYCAR)) != null) for (Feature feature : objects) buoys(feature);
        if ((objects = map.features.get(Obj.BOYISD)) != null) for (Feature feature : objects) buoys(feature);
        if ((objects = map.features.get(Obj.BOYSAW)) != null) for (Feature feature : objects) buoys(feature);
        if ((objects = map.features.get(Obj.BOYSPP)) != null) for (Feature feature : objects) buoys(feature);
        if ((objects = map.features.get(Obj.BOYWTW)) != null) for (Feature feature : objects) buoys(feature);
        if ((objects = map.features.get(Obj.BCNLAT)) != null) for (Feature feature : objects) beacons(feature);
        if ((objects = map.features.get(Obj.BCNCAR)) != null) for (Feature feature : objects) beacons(feature);
        if ((objects = map.features.get(Obj.BCNISD)) != null) for (Feature feature : objects) beacons(feature);
        if ((objects = map.features.get(Obj.BCNSAW)) != null) for (Feature feature : objects) beacons(feature);
        if ((objects = map.features.get(Obj.BCNSPP)) != null) for (Feature feature : objects) beacons(feature);
        if ((objects = map.features.get(Obj.BCNWTW)) != null) for (Feature feature : objects) beacons(feature);
    }
    
    private static void areas(Feature feature) {
        String name = Util.getName(feature);
        switch (feature.type) {
        case DRGARE:
            if (zoom < 16)
                Renderer.lineVector(feature, new LineStyle(Color.black, 8, new float[] { 25, 25 }, new Color(0x40ffffff, true)));
            else
                Renderer.lineVector(feature, new LineStyle(Color.black, 8, new float[] { 25, 25 }));
            if ((zoom >= 12) && (name != null))
                Renderer.labelText(feature, name, new Font("Arial", Font.PLAIN, 100), LabelStyle.NONE, Color.black);
            break;
        case FAIRWY:
            if (feature.area > 2.0) {
                if (zoom < 16)
                    Renderer.lineVector(feature, new LineStyle(Mline, 8, new float[] { 50, 50 }, new Color(0x40ffffff, true)));
                else
                    Renderer.lineVector(feature, new LineStyle(Mline, 8, new float[] { 50, 50 }));
            } else {
                if (zoom >= 14)
                    Renderer.lineVector(feature, new LineStyle(null, 0, new Color(0x40ffffff, true)));
            }
            break;
        case MARCUL:
            if (zoom >= 14)
                Renderer.symbol(feature, Areas.MarineFarm);
            if (zoom >= 16)
                Renderer.lineVector(feature, new LineStyle(Color.black, 4, new float[] { 10, 10 }));
            break;
        case OSPARE:
            if (Util.testAttribute(feature, feature.type, Att.CATPRA, CatPRA.PRA_WFRM)) {
                Renderer.symbol(feature, Areas.WindFarm);
                Renderer.lineVector(feature, new LineStyle(Color.black, 20, new float[] { 40, 40 }));
                if ((zoom >= 15) && (name != null))
                    Renderer.labelText(feature, name, new Font("Arial", Font.BOLD, 80), LabelStyle.NONE, Color.black, new Delta(Handle.TC, AffineTransform.getTranslateInstance(0, 10)));
            }
            break;
        case RESARE:
            if (zoom >= 12) {
                Renderer.lineSymbols(feature, Areas.Restricted, 1.0, null, null, 0, Mline);
                if (Util.testAttribute(feature, feature.type, Att.CATPRA, CatREA.REA_NWAK)) {
                    Renderer.symbol(feature, Areas.NoWake);
                }
            }
            break;
        case SEAARE:
            switch ((CatSEA) Util.getAttVal(feature, feature.type, 0, Att.CATSEA)) {
            case SEA_RECH:
                break;
            case SEA_BAY:
                break;
            case SEA_SHOL:
                break;
            case SEA_GAT:
            case SEA_NRRW:
                break;
            default:
                break;
            }
            break;
/*
  if (is_type("sea_area")) {
    if (has_attribute("category")) {
      make_string("");
      attribute_switch("category")
      attribute_case("reach") { if (zoom >= 10) add_string("font-family:Arial;font-weight:normal;font-style:italic;font-size:150;text-anchor:middle") }
      attribute_case("bay") { if (zoom >= 12) add_string("font-family:Arial;font-weight:normal;font-style:italic;font-size:150;text-anchor:middle") }
      attribute_case("shoal") { if (zoom >= 14) {
        if (is_area) {
          area("stroke:#c480ff;stroke-width:4;stroke-dasharray:25,25;fill:none");
          if (has_item_attribute("name")) text(item_attribute("name"), "font-family:Arial;font-weight:normal;font-style:italic;font-size:75;text-anchor:middle", 0, -40);
          text("(Shoal)", "font-family:Arial;font-weight:normal;font-size:60;text-anchor:middle", 0, 0);
        } else if (is_line) {
          if (has_item_attribute("name")) way_text(item_attribute("name"), "font-family:Arial;font-weight:normal;font-style:italic;font-size:75;text-anchor:middle", 0.5, -40, line("stroke:none;fill:none"));
          way_text("(Shoal)", "font-family:Arial;font-weight:normal;font-size:60;text-anchor:middle", 0.5, 0, line("stroke:none;fill:none"));
        } else {
          if (has_item_attribute("name")) text(item_attribute("name"), "font-family:Arial;font-weight:normal;font-style:italic;font-size:75;text-anchor:middle", 0, -40);
          text("(Shoal)", "font-family:Arial;font-weight:normal;font-size:60;text-anchor:middle", 0, 0);
        }
      }
      }
      attribute_case("gat|narrows") { if (zoom >= 12) add_string("font-family:Arial;font-weight:normal;font-style:italic;font-size:100;text-anchor:middle") }
      end_switch
      if ((strlen(string) > 0) && !attribute_test("category", "shoal")) {
        int ref = line("stroke:none;fill:none");
        if (ref != 0) {
          if (has_item_attribute("name")) way_text(item_attribute("name"), string, 0.5, 0, ref);
        } else {
          if (has_item_attribute("name")) text(item_attribute("name"), string, 0, 0);
        }
      }
      free_string
    }
  }
 */
        case SNDWAV:
            if (zoom >= 12) Renderer.fillPattern(feature, Areas.Sandwaves);
            break;
        case SPLARE:
            if (zoom >= 12) {
                Renderer.symbol(feature, Areas.Plane);
                Renderer.lineSymbols(feature, Areas.Restricted, 0.5, Areas.LinePlane, null, 10, Mline);
            }
            if ((zoom >= 15) && (name != null))
                Renderer.labelText(feature, name, new Font("Arial", Font.BOLD, 80), LabelStyle.NONE, Color.black, new Delta(Handle.BC, AffineTransform.getTranslateInstance(0, -90)));
            break;
        default:
            break;
        }
    }
    
    private static void beacons(Feature feature) {
        BcnSHP shape = (BcnSHP) Util.getAttVal(feature, feature.type, 0, Att.BCNSHP);
        if (((shape == BcnSHP.BCN_PRCH) || (shape == BcnSHP.BCN_WTHY)) && (feature.type == Obj.BCNLAT)) {
            CatLAM cat = (CatLAM) Util.getAttVal(feature, feature.type, 0, Att.CATLAM);
            switch (cat) {
            case LAM_PORT:
                if (shape == BcnSHP.BCN_PRCH)
                    Renderer.symbol(feature, Beacons.PerchPort);
                else
                    Renderer.symbol(feature, Beacons.WithyPort);
                break;
            case LAM_STBD:
                if (shape == BcnSHP.BCN_PRCH)
                    Renderer.symbol(feature, Beacons.PerchStarboard);
                else
                    Renderer.symbol(feature, Beacons.WithyStarboard);
                break;
            default:
                Renderer.symbol(feature, Beacons.Stake, Util.getScheme(feature, feature.type));
            }
        } else {
            Renderer.symbol(feature, Beacons.Shapes.get(shape), Util.getScheme(feature, feature.type));
            if (feature.objs.get(Obj.TOPMAR) != null)
                Renderer.symbol(feature, Topmarks.Shapes.get(feature.objs.get(Obj.TOPMAR).get(0).get(Att.TOPSHP).val), Util.getScheme(feature, Obj.TOPMAR), Topmarks.BeaconDelta);
        }
        Signals.addSignals(feature);
    }
    
    private static void buoys(Feature feature) {
        BoySHP shape = (BoySHP) Util.getAttVal(feature, feature.type, 0, Att.BOYSHP);
        Renderer.symbol(feature, Buoys.Shapes.get(shape), Util.getScheme(feature, feature.type));
        if (Util.hasObject(feature, Obj.TOPMAR)) {
            Renderer.symbol(feature, Topmarks.Shapes.get(feature.objs.get(Obj.TOPMAR).get(0).get(Att.TOPSHP).val), Util.getScheme(feature, Obj.TOPMAR), Topmarks.BuoyDeltas.get(shape));
        }
        Signals.addSignals(feature);
    }
    
    private static void bridges(Feature feature) {
        if (zoom >= 16) {
            double verclr, verccl, vercop;
            AttMap atts = feature.objs.get(Obj.BRIDGE).get(0);
            String str = "";
            if (atts != null) {
                if (atts.containsKey(Att.VERCLR)) {
                    verclr = (Double) atts.get(Att.VERCLR).val;
                } else {
                    verclr = atts.containsKey(Att.VERCSA) ? (Double) atts.get(Att.VERCSA).val : 0;
                }
                verccl = atts.containsKey(Att.VERCCL) ? (Double) atts.get(Att.VERCCL).val : 0;
                vercop = atts.containsKey(Att.VERCOP) ? (Double) atts.get(Att.VERCOP).val : 0;
                if (verclr > 0) {
                    str += String.valueOf(verclr);
                } else if (verccl > 0) {
                    if (vercop == 0) {
                        str += String.valueOf(verccl) + "/-";
                    } else {
                        str += String.valueOf(verccl) + "/" + String.valueOf(vercop);
                    }
                }
                if (!str.isEmpty())
                    Renderer.labelText(feature, str, new Font("Arial", Font.PLAIN, 30), LabelStyle.VCLR, Color.black, Color.white, new Delta(Handle.CC));
            }
        }
    }
    
    private static void cables(Feature feature) {
        if ((zoom >= 16) && (feature.length < 2)) {
            if (feature.type == Obj.CBLSUB) {
                Renderer.lineSymbols(feature, Areas.Cable, 0.0, null, null, 0, Mline);
            } else if (feature.type == Obj.CBLOHD) {
                AttMap atts = feature.objs.get(Obj.CBLOHD).get(0);
                if ((atts != null) && (atts.containsKey(Att.CATCBL)) && (atts.get(Att.CATCBL).val == CatCBL.CBL_POWR)) {
                    Renderer.lineSymbols(feature, Areas.CableDash, 0, Areas.CableDot, Areas.CableFlash, 2, Color.black);
                } else {
                    Renderer.lineSymbols(feature, Areas.CableDash, 0, Areas.CableDot, null, 2, Color.black);
                }
            }
        }
    }
    
    private static void distances(Feature feature) {
        if (zoom >= 14) {
            if (!Util.testAttribute(feature, Obj.DISMAR, Att.CATDIS, CatDIS.DIS_NONI)) {
                Renderer.symbol(feature, Harbours.DistanceI);
            } else {
                Renderer.symbol(feature, Harbours.DistanceU);
            }
            if ((zoom >=15) && Util.hasAttribute(feature, Obj.DISMAR, Att.WTWDIS)) {
                AttMap atts = feature.objs.get(Obj.DISMAR).get(0);
                Double dist = (Double) atts.get(Att.WTWDIS).val;
                String str = "";
                if (atts.containsKey(Att.HUNITS)) {
                    switch ((UniHLU) atts.get(Att.HUNITS).val) {
                    case HLU_METR:
                        str += "m ";
                        break;
                    case HLU_FEET:
                        str += "ft ";
                        break;
                    case HLU_HMTR:
                        str += "hm ";
                        break;
                    case HLU_KMTR:
                        str += "km ";
                        break;
                    case HLU_SMIL:
                        str += "M ";
                        break;
                    case HLU_NMIL:
                        str += "NM ";
                        break;
                    default:
                        break;
                    }
                }
                str += String.format("%1.0f", dist);
                Renderer.labelText(feature, str, new Font("Arial", Font.PLAIN, 40), LabelStyle.NONE, Color.black, null, new Delta(Handle.CC, AffineTransform.getTranslateInstance(0, 45)));
            }
        }
    }
    
    private static void floats(Feature feature) {
        switch (feature.type) {
        case LITVES:
            Renderer.symbol(feature, Buoys.Super, Util.getScheme(feature, feature.type));
            break;
        case LITFLT:
            Renderer.symbol(feature, Buoys.Float, Util.getScheme(feature, feature.type));
            break;
        case BOYINB:
            Renderer.symbol(feature, Buoys.Super, Util.getScheme(feature, feature.type));
            break;
        default:
            break;
        }
        if (feature.objs.get(Obj.TOPMAR) != null)
            Renderer.symbol(feature, Topmarks.Shapes.get(feature.objs.get(Obj.TOPMAR).get(0).get(Att.TOPSHP).val), Util.getScheme(feature, Obj.TOPMAR), Topmarks.FloatDelta);
        Signals.addSignals(feature);
    }
    
    private static void gauges(Feature feature) {
/*object_rules(gauge) {
  if (zoom >= 14) symbol("tide_gauge");
}
*/
        Signals.addSignals(feature);
    }
    
    private static void harbours(Feature feature) {
        String name = Util.getName(feature);
        switch (feature.type) {
        case ACHBRT:
            if (zoom >= 14) {
                Renderer.symbol(feature, Harbours.Anchorage, new Scheme(Mline));
            Renderer.labelText(feature, name == null ? "" : name, new Font("Arial", Font.PLAIN, 30), LabelStyle.RRCT, Mline, Color.white, new Delta(Handle.BC));
            }
            double radius = (Double)Util.getAttVal(feature, Obj.ACHBRT, 0, Att.RADIUS);
            if (radius != 0) {
                UniHLU units = (UniHLU)Util.getAttVal(feature, Obj.ACHBRT, 0, Att.HUNITS);
                Renderer.lineCircle (feature, new LineStyle(Mline, 4, new float[] { 10, 10 }, null), radius, units);
            }
            break;
        case ACHARE:
            if (zoom >= 12) {
                if (feature.flag != Fflag.AREA) {
                    Renderer.symbol(feature, Harbours.Anchorage, new Scheme(Color.black));
                } else {
                    Renderer.symbol(feature, Harbours.Anchorage, new Scheme(Mline));
                    Renderer.lineSymbols(feature, Areas.Restricted, 1.0, Areas.LineAnchor, null, 10, Mline);
                }
                if ((zoom >= 15) && ((name) != null)) {
                    Renderer.labelText(feature, name, new Font("Arial", Font.BOLD, 60), LabelStyle.NONE, Mline, null, new Delta(Handle.LC, AffineTransform.getTranslateInstance(70, 0)));
                }
                ArrayList<StsSTS> sts = (ArrayList<StsSTS>)Util.getAttVal(feature, Obj.ACHARE, 0, Att.STATUS);
                if ((zoom >= 15) && (sts != null) && (sts.contains(StsSTS.STS_RESV))) {
                    Renderer.labelText(feature, "Reserved", new Font("Arial", Font.PLAIN, 50), LabelStyle.NONE, Mline, null, new Delta(Handle.TC, AffineTransform.getTranslateInstance(0, 60)));
                }
            }
            ArrayList<CatACH> cats = (ArrayList<CatACH>)Util.getAttVal(feature, Obj.ACHARE, 0, Att.CATACH);
            int dy = (cats.size() - 1) * -30;
            for (CatACH cat : cats) {
                switch (cat) {
                case ACH_DEEP:
                    Renderer.labelText(feature, "DW", new Font("Arial", Font.BOLD, 50), LabelStyle.NONE, Mline, null, new Delta(Handle.RC, AffineTransform.getTranslateInstance(-60, dy)));
                    dy += 60;
                    break;
                case ACH_TANK:
                    Renderer.labelText(feature, "Tanker", new Font("Arial", Font.BOLD, 50), LabelStyle.NONE, Mline, null, new Delta(Handle.RC, AffineTransform.getTranslateInstance(-60, dy)));
                    dy += 60;
                    break;
                case ACH_H24P:
                    Renderer.labelText(feature, "24h", new Font("Arial", Font.BOLD, 50), LabelStyle.NONE, Mline, null, new Delta(Handle.RC, AffineTransform.getTranslateInstance(-60, dy)));
                    dy += 60;
                    break;
                case ACH_EXPL:
                    Renderer.symbol(feature, Harbours.Explosives, new Scheme(Mline), new Delta(Handle.RC, AffineTransform.getTranslateInstance(-60, dy)));
                    dy += 60;
                    break;
                case ACH_QUAR:
                    Renderer.symbol(feature, Harbours.Hospital, new Scheme(Mline), new Delta(Handle.RC, AffineTransform.getTranslateInstance(-60, dy)));
                    dy += 60;
                    break;
                case ACH_SEAP:
                    Renderer.symbol(feature, Areas.Seaplane, new Scheme(Mline), new Delta(Handle.RC, AffineTransform.getTranslateInstance(-60, dy)));
                    dy += 60;
                    break;
                }
            }
            break;
        case BERTHS:
            if (zoom >= 14) {
                Renderer.labelText(feature, name == null ? " " : name, new Font("Arial", Font.PLAIN, 40), LabelStyle.RRCT, Mline, Color.white, null);
            }
            break;
        case BUISGL:
          if (zoom >= 16) {
            ArrayList<Symbol> symbols = new ArrayList();
            ArrayList<FncFNC> fncs = (ArrayList<FncFNC>) Util.getAttVal(feature, Obj.BUISGL, 0, Att.FUNCTN);
            for (FncFNC fnc : fncs) {
                symbols.add(Landmarks.Funcs.get(fnc));
            }
              if (feature.objs.containsKey(Obj.SMCFAC))  {
                ArrayList<CatSCF> scfs = (ArrayList<CatSCF>) Util.getAttVal(feature, Obj.SMCFAC, 0, Att.CATSCF);
                for (CatSCF scf : scfs) {
                    symbols.add(Facilities.Cats.get(scf));
                }
              }
              Renderer.cluster(feature, symbols);
          }
            break;
        default:
            break;
        }
    }
/*
  if ((zoom >= 12) && is_type("harbour")) {
    if (has_attribute("category")) {
      attribute_switch("category")
      attribute_case("marina|yacht") symbol("marina");
      attribute_case("marina_no_facilities") symbol("marina_nf");
      attribute_default symbol("harbour");
      end_switch
    } else symbol("harbour");
    if ((zoom >= 15) && (has_item_attribute("name")))
      text(item_attribute("name"), "font-family:Arial; font-weight:bold; font-size:80; text-anchor:middle", 0, -90);
  }
*/
    
    private static void landmarks(Feature feature) {
        ArrayList<CatLMK> cats = (ArrayList<CatLMK>) Util.getAttVal(feature, feature.type, 0, Att.CATLMK);
        Symbol catSym = Landmarks.Shapes.get(cats.get(0));
        ArrayList<FncFNC> fncs = (ArrayList<FncFNC>) Util.getAttVal(feature, feature.type, 0, Att.FUNCTN);
        Symbol fncSym = Landmarks.Funcs.get(fncs.get(0));
        if ((fncs.get(0) == FncFNC.FNC_CHCH) && (cats.get(0) == CatLMK.LMK_TOWR))
            catSym = Landmarks.ChurchTower;
        if ((cats.get(0) == CatLMK.LMK_UNKN) && (fncs.get(0) == FncFNC.FNC_UNKN) && (feature.objs.get(Obj.LIGHTS) != null))
            catSym = Beacons.LightMajor;
        if (cats.get(0) == CatLMK.LMK_RADR)
            fncSym = Landmarks.RadioTV;
        Renderer.symbol(feature, catSym);
        Renderer.symbol(feature, fncSym);
/*  if (!has_attribute("function") && !has_attribute("category") && has_object("light")) {
    symbol("lighthouse");
    if ((zoom >= 15) && has_item_attribute("name"))
      text(item_attribute("name"), "font-family:Arial; font-weight:bold; font-size:80; text-anchor:middle", 0, -70);
  } else {
    if ((zoom >= 15) && has_item_attribute("name"))
      text(item_attribute("name"), "font-family:Arial; font-weight:bold; font-size:80; text-anchor:start", 60, -50);
  }
}
*/
        Signals.addSignals(feature);
    }
    
    private static void buildings(Feature feature) {
    }
    
    private static void lights(Feature feature) {
        switch (feature.type) {
        case LITMAJ:
            Renderer.symbol(feature, Beacons.LightMajor);
            break;
        case LITMIN:
        case LIGHTS:
            Renderer.symbol(feature, Beacons.LightMinor);
            break;
        }
        Signals.addSignals(feature);
    }
    
    private static void locks(Feature feature) {
    }
    private static void marinas(Feature feature) {
        if (zoom >= 16) {
            
        }
    }
    
    private static void moorings(Feature feature) {
        CatMOR cat = (CatMOR) Util.getAttVal(feature, feature.type, 0, Att.CATMOR);
        switch (cat) {
        case MOR_DLPN:
            Renderer.symbol(feature, Harbours.Dolphin);
            break;
        case MOR_DDPN:
            Renderer.symbol(feature, Harbours.DeviationDolphin);
            break;
        case MOR_BLRD:
        case MOR_POST:
            Renderer.symbol(feature, Harbours.Bollard);
            break;
        case MOR_BUOY:
            BoySHP shape = (BoySHP) Util.getAttVal(feature, feature.type, 0, Att.BOYSHP);
            if (shape == BoySHP.BOY_UNKN)
                shape = BoySHP.BOY_SPHR;
            Renderer.symbol(feature, Buoys.Shapes.get(shape), Util.getScheme(feature, feature.type));
            break;
        }
        Signals.addSignals(feature);
    }

    private static void notices(Feature feature) {
        if (zoom >= 14) {
            double dx = 0.0, dy = 0.0;
            switch (feature.type) {
            case BCNCAR:
            case BCNISD:
            case BCNLAT:
            case BCNSAW:
            case BCNSPP:
            case BCNWTW:
                dy = 45.0;
                break;
            case NOTMRK:
                dy = 0.0;
                break;
            default:
                return;
            }
            Symbol s1 = null, s2 = null;
            MarSYS sys = MarSYS.SYS_CEVN;
            BnkWTW bnk = BnkWTW.BWW_UNKN;
            AttItem att = feature.atts.get(Att.MARSYS);
            if (att != null) sys = (MarSYS)att.val;
            ObjTab objs = feature.objs.get(Obj.NOTMRK);
            int n = objs.size();
            if (n > 2) {
                s1 = Notices.Notice;
                n = 1;
            } else {
                for (AttMap atts : objs.values()) {
                    if (atts.get(Att.MARSYS) != null) sys = (MarSYS)atts.get(Att.MARSYS).val;
                    CatNMK cat = CatNMK.NMK_UNKN;
                    if (atts.get(Att.CATNMK) != null) cat = (CatNMK)atts.get(Att.CATNMK).val;
                    s2 = Notices.getNotice(cat, sys);
                }
            }
/*      Obj_t *obj = getObj(item, NOTMRK, i);
      if (obj == NULL) continue;
      Atta_t add;
      int idx = 0;
      while ((add = getAttEnum(obj, ADDMRK, idx++)) != MRK_UNKN) {
        if ((add == MRK_LTRI) && (i == 2)) swap = true;
        if ((add == MRK_RTRI) && (i != 2)) swap = true;
      }
    }
  } else {
    
  }
  for (int i = 0; i <=2; i++) {
    Obj_t *obj = getObj(item, NOTMRK, i);
    if (obj == NULL) continue;
    Atta_t category = getAttEnum(obj, CATNMK, i);
    Atta_t add;
    int idx = 0;
    int top=0, bottom=0, left=0, right=0;
    while ((add = getAttEnum(obj, ADDMRK, idx++)) != MRK_UNKN) {
      switch (add) {
        case MRK_TOPB:
          top = add;
          break;
        case MRK_BOTB:
        case MRK_BTRI:
          bottom = add;
          break;
        case MRK_LTRI:
          left = add;
          break;
        case MRK_RTRI:
          right = add;
          break;
        default:
          break;
      }
    }
    double orient = getAtt(obj, ORIENT) != NULL ? getAtt(obj, ORIENT)->val.val.f : 0.0;
    int system = getAtt(obj, MARSYS) != NULL ? getAtt(obj, MARSYS)->val.val.e : 0;
    double flip = 0.0;
    char *symb = "";
    char *base = "";
    char *colour = "black";
    if ((system == SYS_BWR2) || (system == SYS_BNWR)) {
      symb = bniwr_map[category];
      switch (category) {
        case NMK_NANK:
        case NMK_LMHR:
        case NMK_KTPM...NMK_RSPD:
        {
          int bank = getAtt(obj, BNKWTW) != NULL ? getAtt(obj, BNKWTW)->val.val.e : 0;
          switch (bank) {
            case BWW_LEFT:
              base = "notice_blb";
              colour = "red";
              break;
            case BWW_RGHT:
              base = "notice_brb";
              colour = "green";
              break;
            default:
              base = "notice_bsi";
              colour = "black";
              break;
          }
        }
        default:
          break;
      }
    } else if (system == SYS_PPWB) {
      int bank = getAtt(obj, BNKWTW) != NULL ? getAtt(obj, BNKWTW)->val.val.e : 0;
      if (bank != 0) {
        switch (category) {
          case NMK_WLAR:
            if (bank == BNK_LEFT)
              base = "notice_pwlarl";
            else
              base = "notice_pwlarr";
            break;
          case NMK_WRAL:
            if (bank == BNK_LEFT)
              base = "notice_pwrall";
            else
              base = "notice_pwralr";
            break;
          case NMK_KTPM:
            if (bank == BNK_LEFT)
              base = "notice_ppml";
            else
              base = "notice_ppmr";
            break;
          case NMK_KTSM:
            if (bank == BNK_LEFT)
              base = "notice_psml";
            else
              base = "notice_psmr";
            break;
          case NMK_KTMR:
            if (bank == BNK_LEFT)
              base = "notice_pmrl";
            else
              base = "notice_pmrr";
            break;
          case NMK_CRTP:
          if (bank == BNK_LEFT)
              base = "notice_pcpl";
            else
              base = "notice_pcpr";
            break;
          case NMK_CRTS:
            if (bank == BNK_LEFT)
              base = "notice_pcsl";
            else
              base = "notice_pcsr";
            break;
          default:
            break;
        }
      }
    } else {
      symb = notice_map[category];
      switch (category) {
        case NMK_NOVK...NMK_NWSH:
        case NMK_NMTC...NMK_NLBG:
          base = "notice_a";
          break;
        case NMK_MVTL...NMK_CHDR:
          base = "notice_b";
          break;
        case NMK_PRTL...NMK_PRTR:
        case NMK_OVHC...NMK_LBGP:
          base = "notice_e";
          colour = "white";
          break;
        default:
          break;
      }
      switch (category) {
        case NMK_MVTL:
        case NMK_ANKP:
        case NMK_PRTL:
        case NMK_MWAL:
        case NMK_MWAR:
          flip = 180.0;
          break;
        case NMK_SWWR:
        case NMK_WRSL:
        case NMK_WARL:
          flip = -90.0;
          break;
        case NMK_SWWC:
        case NMK_SWWL:
        case NMK_WLSR:
        case NMK_WALR:
          flip = 90.0;
          break;
        default:
          break;
      }
    }
    if (n == 2) {
      dx = (((i != 2) && swap) || ((i == 2) && !swap)) ? -30.0 : 30.0;
    }
    if (top == MRK_TOPB)
      renderSymbol(item, NOTMRK, "notice_board", "", "", BC, dx, dy, orient);
    if (bottom == MRK_BOTB)
      renderSymbol(item, NOTMRK, "notice_board", "", "", BC, dx, dy, orient+180);
    if (bottom == MRK_BTRI)
      renderSymbol(item, NOTMRK, "notice_triangle", "", "", BC, dx, dy, orient+180);
    if (left == MRK_LTRI)
      renderSymbol(item, NOTMRK, "notice_triangle", "", "", BC, dx, dy, orient-90);
    if (right == MRK_RTRI)
      renderSymbol(item, NOTMRK, "notice_triangle", "", "", BC, dx, dy, orient+90);
    renderSymbol(item, NOTMRK, base, "", "", CC, dx, dy, orient);
    renderSymbol(item, NOTMRK, symb, "", colour, CC, dx, dy, orient+flip);
  }
*/
        }
    }
    private static void obstructions(Feature feature) {
        if ((zoom >= 14) && (feature.type == Obj.UWTROC)) {
            WatLEV lvl = (WatLEV) Util.getAttVal(feature, feature.type, 0, Att.WATLEV);
            switch (lvl) {
            case LEV_CVRS:
                Renderer.symbol(feature, Areas.RockC);
                break;
            case LEV_AWSH:
                Renderer.symbol(feature, Areas.RockA);
                break;
            default:
                Renderer.symbol(feature, Areas.Rock);
            }
        } else {
            Renderer.symbol(feature, Areas.Rock);
        }
    }
    private static void pipelines(Feature feature) {
        if (zoom >= 14) {
            if (feature.type == Obj.PIPSOL) {
                Renderer.lineSymbols(feature, Areas.Pipeline, 1.0, null, null, 0, Mline);
            } else if (feature.type == Obj.PIPOHD) {

            }
        }
    }
    private static void platforms(Feature feature) {
        ArrayList<CatOFP> cats = (ArrayList<CatOFP>)Util.getAttVal(feature, Obj.OFSPLF, 0, Att.CATOFP);
        if ((CatOFP) cats.get(0) == CatOFP.OFP_FPSO)
            Renderer.symbol(feature, Buoys.Storage);
        else
            Renderer.symbol(feature, Landmarks.Platform);
        String name = Util.getName(feature);
        if ((zoom >= 15) && (name != null))
            Renderer.labelText(feature, name, new Font("Arial", Font.BOLD, 40), LabelStyle.NONE, Color.black, null, new Delta(Handle.BL, AffineTransform.getTranslateInstance(20, -50)));
/*object_rules(platforms) {
  if (has_object("fog_signal")) object(fogs);
  if (has_object("radar_transponder")) object(rtbs);
  if (has_object("light")) object(lights);
}
*/
    }
    private static void ports(Feature feature) {
        if (zoom >= 14) {
            if (feature.type == Obj.CRANES) {
                if ((CatCRN) Util.getAttVal(feature, feature.type, 0, Att.CATCRN) == CatCRN.CRN_CONT)
                    Renderer.symbol(feature, Harbours.ContainerCrane);
                else
                    Renderer.symbol(feature, Harbours.PortCrane);
            } else if (feature.type == Obj.HULKES) {
                Renderer.lineVector(feature, new LineStyle(Color.black, 4, null, new Color(0xffe000)));
                String name = Util.getName(feature);
                if ((zoom >= 15) && (name != null))
                    Renderer.labelText(feature, name, new Font("Arial", Font.BOLD, 80), LabelStyle.NONE, Color.black, null, null);
            }
        }
    }
    private static void separation(Feature feature) {
        switch (feature.type) {
        case TSEZNE:
        case TSSCRS:
        case TSSRON:
            if (zoom <= 15)
                Renderer.lineVector(feature, new LineStyle(null, 0, null, new Color(0x80c48080, true)));
            else
                Renderer.lineVector(feature, new LineStyle(new Color(0x80c48080, true), 20, null, null));
            String name = Util.getName(feature);
            if ((zoom >= 10) && (name != null))
                Renderer.labelText(feature, name, new Font("Arial", Font.BOLD, 150), LabelStyle.NONE, new Color(0x80c48080, true), null, null);
            break;
        case TSELNE:
            Renderer.lineVector(feature, new LineStyle(new Color(0x80c48080, true), 20, null, null));
            break;
        case TSSLPT:
            Renderer.lineSymbols(feature, Areas.LaneArrow, 0.5, null, null, 0, new Color(0x80c48080, true));
            break;
        case TSSBND:
            Renderer.lineVector(feature, new LineStyle(new Color(0x80c48080, true), 20, new float[] { 40, 40 }, null));
            break;
        case ISTZNE:
            Renderer.lineSymbols(feature, Areas.Restricted, 1.0, null, null, 0, new Color(0x80c48080, true));
            break;
        }
    }
    private static void shoreline(Feature feature) {
        if (zoom >= 12) {
            switch ((CatSLC) Util.getAttVal(feature, feature.type, 0, Att.CATSLC)) {
            case SLC_TWAL:
                WatLEV lev = (WatLEV) Util.getAttVal(feature, feature.type, 0, Att.WATLEV);
                if (lev == WatLEV.LEV_CVRS) {
                    Renderer.lineVector(feature, new LineStyle(Color.black, 10, new float[] { 40, 40 }, null));
                    if (zoom >= 15)
                        Renderer.lineText(feature, "(covers)", new Font("Arial", Font.PLAIN, 80), Color.black, 0.5, 20);
                } else {
                    Renderer.lineVector(feature, new LineStyle(Color.black, 10, null, null));
                }
                if (zoom >= 15)
                    Renderer.lineText(feature, "Training Wall", new Font("Arial", Font.PLAIN, 80), Color.black, 0.5, -20);
            }
        }
    }
    
    private static void stations(Feature feature) {
        if (zoom >= 14) {
            switch (feature.type) {
            case SISTAT:
            case SISTAW:
                Renderer.symbol(feature, Harbours.SignalStation);
                String str = "SS";
                //  Append (cat) to str
                Renderer.labelText(feature, str, new Font("Arial", Font.PLAIN, 40), LabelStyle.NONE, Color.black, null, new Delta(Handle.LC, AffineTransform.getTranslateInstance(30, 0)));
                break;
            case RDOSTA:
                Renderer.symbol(feature, Harbours.SignalStation);
                Renderer.symbol(feature, Beacons.RadarStation);
                break;
            case RADSTA:
                Renderer.symbol(feature, Harbours.SignalStation);
                Renderer.symbol(feature, Beacons.RadarStation);
                break;
            case PILBOP:
                Renderer.symbol(feature, Harbours.Pilot);
                break;
            case CGUSTA:
                Renderer.symbol(feature, Harbours.SignalStation);
                Renderer.labelText(feature, "CG", new Font("Arial", Font.PLAIN, 40), LabelStyle.NONE, Color.black, null, new Delta(Handle.LC, AffineTransform.getTranslateInstance(30, 0)));
                break;
            case RSCSTA:
                Renderer.symbol(feature, Harbours.Rescue);
                break;
            }
        }
        Signals.addSignals(feature);
    }
    
    private static void transits(Feature feature) {
      if (zoom >= 12) {
        if (feature.type == Obj.RECTRC) Renderer.lineVector (feature, new LineStyle(Color.black, 10, null, null));
        else if (feature.type == Obj.NAVLNE) Renderer.lineVector (feature, new LineStyle(Color.black, 10, new float[] { 25, 25 }, null));
      }
      if (zoom >= 15) {
        String str = "";
            String name = Util.getName(feature);
            if (name != null) str += name + " ";
            Double ort = (Double) Util.getAttVal(feature, feature.type, 0, Att.ORIENT);
            if (ort != null) str += ort.toString() + "\u0152";
            if (!str.isEmpty()) Renderer.lineText(feature, str, new Font("Arial", Font.PLAIN, 80), Color.black, 0.5, -20);
      }
    }
    private static void waterways(Feature feature) {
        
    }
    
    private static void wrecks(Feature feature) {
        if (zoom >= 14) {
            CatWRK cat = (CatWRK) Util.getAttVal(feature, feature.type, 0, Att.CATWRK);
            switch (cat) {
            case WRK_DNGR:
            case WRK_MSTS:
                Renderer.symbol(feature, Areas.WreckD);
                break;
            case WRK_HULS:
                Renderer.symbol(feature, Areas.WreckS);
                break;
            default:
                Renderer.symbol(feature, Areas.WreckND);
            }
        }
    }
}
