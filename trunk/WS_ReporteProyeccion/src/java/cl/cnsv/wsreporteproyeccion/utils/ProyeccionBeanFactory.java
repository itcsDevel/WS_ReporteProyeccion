/*
 * copyright(c) Consorcio Nacional de Seguros - Chile
 */

package cl.cnsv.wsreporteproyeccion.utils;

import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.AsegurableVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.DatosSimulacionVidAhorro100VO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.FamiliarVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.ListFamiliaresVO;
import cl.cnsv.wsreporteproyeccion.cliente.cotizadorvida.OutputWSProyeccionVidAhorro100;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.Asegurable;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.Cobertura;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.DatosSimulacionVidAhorro100;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.Familiar;
import cl.cnsv.wsreporteproyeccion.cliente.proyeccion.TransaccionVidAhorro100;
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
        output.setFamiliares(familiares);
        return output;
    }

    private static Asegurable buildAsegurable(AsegurableVO input) {
        Asegurable output = new Asegurable();
        List<Cobertura> coberturas = buildCoberturas(input.getCoberturas());
        output.setCoberturas(coberturas);
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
        output.setCoberturas(coberturas);
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
}