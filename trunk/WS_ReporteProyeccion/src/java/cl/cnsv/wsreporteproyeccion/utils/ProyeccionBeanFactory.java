/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */

package cl.cnsv.wsreporteproyeccion.utils;

import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.AsegurableVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.DatosSimulacionFlexInvGoldVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.DatosSimulacionVidAhorro100VO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.DatosSimulacionVidAhorro57BisVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.DatosSimulacionVidAhorroFlexVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.FamiliarVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.ListFamiliaresVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionFlexInvGlodVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionVidAhorro100;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionVidAhorro57Bis;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionVidAhorroFlex;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.Asegurable;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.Cobertura;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.DatosSimulacionFlexInvGold;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.DatosSimulacionVidAhorro100;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.DatosSimulacionVidAhorro57Bis;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.DatosSimulacionVidAhorroFlex;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.Familiar;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.TransaccionFlexInvGold;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.TransaccionVidAhorro100;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.TransaccionVidAhorro57Bis;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.TransaccionVidAhorroFlex;
import java.util.ArrayList;
import java.util.List;

/** 
 * Clase que construye objetos para la entrada al servicio de proyeccion.
 * 
 * fecha: 05-08-2016 
 * @author exitcs6 
 */
public class ProyeccionBeanFactory {
    
    public static TransaccionVidAhorro100 buildVa100(OutputWSProyeccionVidAhorro100 input){
        TransaccionVidAhorro100 output = new TransaccionVidAhorro100();
        Asegurable asegurable = buildAsegurable(input.getAsegurable());
        output.setAsegurable(asegurable);
        DatosSimulacionVidAhorro100 datosSimulacionVidAhorro100 = buildDatosSimulacionVa100(input.getDatosSimulacionVidAhorro100VO());
        output.setDatosSimulacion(datosSimulacionVidAhorro100);
        List<Familiar> familiares = buildFamiliares(input.getListFamiliaresVO());
        for (Familiar familiar : familiares) {
            output.getFamiliares().add(familiar);
        }
        return output;
    }

    private static Asegurable buildAsegurable(AsegurableVO input) {
        Asegurable output = new Asegurable();
        List<Cobertura> coberturas = buildCoberturas(input.getCoberturas());
        for (Cobertura cobertura : coberturas) {
            output.getCoberturas().add(cobertura);
        }
        output.setFechaNacimiento(input.getFechaNacimiento());
        output.setFumador(input.getFumador());
        output.setSexo(input.getSexo());
        return output;
    }

    private static DatosSimulacionVidAhorro100 buildDatosSimulacionVa100(DatosSimulacionVidAhorro100VO input) {
        DatosSimulacionVidAhorro100 output = new DatosSimulacionVidAhorro100();
        output.setCodigoPlan(input.getCodigoPlan());
        output.setFechaCalculoProyeccion(input.getFechaCalculoProyeccion());
        output.setFormaPago(input.getFormaPago());
        output.setPrimaProyectadaSFP(input.getPrimaProyectadaSFP());
        output.setSupuestoRentabilidad(input.getSupuestoRentabilidad());
        return output;
    }

    private static List<Familiar> buildFamiliares(ListFamiliaresVO input) {
        List<Familiar> output = new ArrayList<Familiar>();
        List<FamiliarVO> listFamiliaresVO = input.getListFamiliares();
        for (FamiliarVO familiarVO : listFamiliaresVO) {
            Familiar familiar = buildFamiliar(familiarVO);
            output.add(familiar);
        }
        return output;
    }

    private static Familiar buildFamiliar(FamiliarVO input) {
        Familiar output = new Familiar();
        List<Cobertura> coberturas = buildCoberturas(input.getCoberturas());
        for (Cobertura cobertura : coberturas) {
            output.getCoberturas().add(cobertura);
        }
        output.setCodigo(input.getCodigo());
        output.setFechaNacimiento(input.getFechaNacimiento());
        output.setFumador(input.getFumador());
        output.setSexo(input.getSexo());        
        return output;
    }

    private static List<Cobertura> buildCoberturas(List<cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.Cobertura> input) {
        List<Cobertura> output = new ArrayList<Cobertura>();
        for (cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.Cobertura coberturaInput : input) {
            Cobertura cobertura = buildCobertura(coberturaInput);
            output.add(cobertura);
        }
        return output;
    }

    private static Cobertura buildCobertura(cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.Cobertura input) {
        Cobertura cobertura = new Cobertura();
        cobertura.setCapital(input.getCapital());
        cobertura.setCodigo(input.getCodigo());
        return cobertura;
    }
    
    public static TransaccionVidAhorro57Bis build57Bis(OutputWSProyeccionVidAhorro57Bis input) {
        TransaccionVidAhorro57Bis output = new TransaccionVidAhorro57Bis();
        Asegurable asegurable = buildAsegurable(input.getAsegurable());
        output.setAsegurable(asegurable);
        DatosSimulacionVidAhorro57Bis datosSimulacionVidAhorro57Bis = buildDatosSimulacion87Bis(input.getDatosSimulacionVidAhorro57BisVO());
        output.setDatosSimulacion(datosSimulacionVidAhorro57Bis);
        List<Familiar> familiares = buildFamiliares(input.getListFamiliaresVO());
        for (Familiar familiar : familiares) {
            output.getFamiliares().add(familiar);
        }
        //No hay inyecciones, ni recargos, ni rescates para este producto
        return output;
    }

    private static DatosSimulacionVidAhorro57Bis buildDatosSimulacion87Bis(DatosSimulacionVidAhorro57BisVO input) {
        DatosSimulacionVidAhorro57Bis output = new DatosSimulacionVidAhorro57Bis();
        output.setCodigoPlan(input.getCodigoPlan());
        output.setFechaCalculoProyeccion(input.getFechaCalculoProyeccion());
        output.setFormaPago(input.getFormaPago());
        output.setPrimaProyectadaSFP(input.getPrimaProyectadaSFP());
        output.setRentaTributable(input.getRentaTributable());
        output.setSupuestoRentabilidad(input.getSupuestoRentabilidad());
        output.setTipoSimulacion(input.getTipoSimulacion());
        return output;
    }

    public static TransaccionVidAhorroFlex buildFlex(OutputWSProyeccionVidAhorroFlex input) {
        TransaccionVidAhorroFlex output = new TransaccionVidAhorroFlex();
        Asegurable asegurable = buildAsegurable(input.getAsegurable());
        output.setAsegurable(asegurable);
        DatosSimulacionVidAhorroFlex datosSimulacionFlex = buildDatosSimulacionFlex(input.getDatosSimulacionVidAhorroFlexVO());
        output.setDatosSimulacion(datosSimulacionFlex);
        List<Familiar> familiares = buildFamiliares(input.getListFamiliaresVO());
        for (Familiar familiar : familiares) {
            output.getFamiliares().add(familiar);
        }
        return output;
    }

    private static DatosSimulacionVidAhorroFlex buildDatosSimulacionFlex(DatosSimulacionVidAhorroFlexVO input) {
        DatosSimulacionVidAhorroFlex output = new DatosSimulacionVidAhorroFlex();
        output.setCodigoPlan(input.getCodigoPlan());
        output.setFechaCalculoProyeccion(input.getFechaCalculoProyeccion());
        output.setFormaPago(input.getFormaPago());
        output.setPrimaProyectadaSFP(input.getPrimaProyectadaSFP());
        output.setSupuestoRentabilidad(input.getSupuestoRentabilidad());
        return output;
    }

    public static TransaccionFlexInvGold buildFIGold(OutputWSProyeccionFlexInvGlodVO input) {
        TransaccionFlexInvGold output = new TransaccionFlexInvGold();
        Asegurable asegurable = buildAsegurable(input.getAsegurable());
        output.setAsegurable(asegurable);
        DatosSimulacionFlexInvGold datosSimulacionFIGold = buildDatosSimulacionFIGold(input.getDatosSimulacionFlexInvGoldVO());
        output.setDatosSimulacion(datosSimulacionFIGold);        
        return output;
    }
    
    private static DatosSimulacionFlexInvGold buildDatosSimulacionFIGold(DatosSimulacionFlexInvGoldVO input) {
        DatosSimulacionFlexInvGold output = new DatosSimulacionFlexInvGold();
        output.setCodigoPlan(input.getCodigoPlan());
        output.setFechaCalculoProyeccion(input.getFechaCalculoProyeccion());
        output.setPrimeraPrima(input.getPrimeraPrima());
        output.setRentabilidadAnual(input.getRentabilidadAnual());
        return output;
    }
    
    
}