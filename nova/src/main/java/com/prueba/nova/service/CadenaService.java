package com.prueba.nova.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.nova.dto.RequestCadena;
import com.prueba.nova.dto.ResponseCadena;

/**
 * Notación para indicar que es un servicio
 * 
 * @author daniel
 *
 */
@Service
/**
 * Asegura que toda la data requerida este segura hasta que la transacción
 * termine
 * 
 * @author daniel
 *
 */
@Transactional
public class CadenaService {

	static final Logger LOGGER = Logger.getLogger(CadenaService.class);

	/**
	 * 
	 * @param cadena
	 * @return
	 */
	public ResponseCadena minusculas(RequestCadena cadena) {

		ResponseCadena cadenaMinuscula = new ResponseCadena();

		try {
			cadenaMinuscula.setCadena(cadena.getCadena().toLowerCase());
			cadenaMinuscula.setS_Exito(1);
			LOGGER.info(cadenaMinuscula.toString());

		} catch (Exception e) {
			LOGGER.error(e);
			cadenaMinuscula.setCadena(null);
			cadenaMinuscula.setS_Exito(0);
			cadenaMinuscula.setError(e.toString());

		}

		return cadenaMinuscula;
	}

	/**
	 * 
	 * @param cadena
	 * @return
	 */
	public ResponseCadena mayusculas(RequestCadena cadena) {

		ResponseCadena cadenaMayuscula = new ResponseCadena();

		try {
			cadenaMayuscula.setCadena(cadena.getCadena().toUpperCase());
			cadenaMayuscula.setS_Exito(1);
			LOGGER.info(cadenaMayuscula.toString());

		} catch (Exception e) {
			LOGGER.error(e);
			cadenaMayuscula.setCadena(null);
			cadenaMayuscula.setS_Exito(0);
			cadenaMayuscula.setError(e.toString());

		}

		return cadenaMayuscula;

	}

	/**
	 * 
	 * @param cadena
	 * @return
	 */
	public ResponseCadena dosPrimeros(RequestCadena cadena) {

		ResponseCadena dosPrimerosCaracteres = new ResponseCadena();

		try {
			dosPrimerosCaracteres.setCadena(cadena.getCadena().substring(0, 1));
			dosPrimerosCaracteres.setS_Exito(1);
			LOGGER.info(dosPrimerosCaracteres.toString());
		} catch (Exception e) {
			LOGGER.error(e);
			dosPrimerosCaracteres.setCadena(null);
			dosPrimerosCaracteres.setS_Exito(0);
			dosPrimerosCaracteres.setError(e.toString());
		}

		return dosPrimerosCaracteres;

	}

	/**
	 * 
	 * @param cadena
	 * @return
	 */
	public ResponseCadena dosUltimos(RequestCadena cadena) {

		ResponseCadena dosUltimoCaracteres = new ResponseCadena();

		try {
			dosUltimoCaracteres.setCadena(
					cadena.getCadena().substring((cadena.getCadena().length() - 1), cadena.getCadena().length()));
			dosUltimoCaracteres.setS_Exito(1);
			LOGGER.info(dosUltimoCaracteres.toString());
		} catch (Exception e) {
			LOGGER.error(e);
			dosUltimoCaracteres.setCadena(null);
			dosUltimoCaracteres.setS_Exito(0);
			dosUltimoCaracteres.setError(e.toString());
		}

		return dosUltimoCaracteres;

	}

	/**
	 * 
	 * @param cadena
	 * @return
	 */
	public ResponseCadena ocurrencias(RequestCadena cadena) {

		ResponseCadena ocurrencia = new ResponseCadena();

		try {
			int totalCaracter = 0;
			char temp;
			char carter = cadena.getCadena().charAt(cadena.getCadena().length());
			for (int i = 0; i < cadena.getCadena().length(); i++) {

				temp = cadena.getCadena().charAt(i);
				if (temp == carter)
					totalCaracter++;
			}
			ocurrencia.setCadena(totalCaracter + "");
			ocurrencia.setS_Exito(1);
			LOGGER.info(ocurrencia.toString());
		} catch (Exception e) {
			LOGGER.error(e);
			ocurrencia.setCadena(null);
			ocurrencia.setS_Exito(0);
			ocurrencia.setError(e.toString());
		}

		return ocurrencia;

	}

	/**
	 * 
	 * @param cadena
	 * @return
	 */
	public ResponseCadena asteriscos(RequestCadena cadena) {

		ResponseCadena agregar = new ResponseCadena();

		try {
			String asteris = "**";
			agregar.setCadena(asteris.concat(cadena.getCadena().concat(asteris)));
			agregar.setS_Exito(1);
			LOGGER.info(agregar.toString());
		} catch (Exception e) {
			LOGGER.error(e);
			agregar.setCadena(null);
			agregar.setS_Exito(0);
			agregar.setError(e.toString());
		}

		return agregar;

	}

	/**
	 * 
	 * @param cadena
	 * @return
	 */
	public ResponseCadena invertida(RequestCadena cadena) {
		ResponseCadena invertir = new ResponseCadena();

		try {
			invertir.setCadena(new StringBuilder(cadena.getCadena()).reverse().toString());
			invertir.setS_Exito(1);
			LOGGER.info(invertir.toString());
		} catch (Exception e) {
			LOGGER.error(e);
			invertir.setCadena(null);
			invertir.setS_Exito(0);
			invertir.setError(e.toString());
		}

		return invertir;

	}

}
