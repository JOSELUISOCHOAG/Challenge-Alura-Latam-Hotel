package com.alura.latam.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.alura.latam.hotel.modelo.Nacionalidad;

public class NacionalidadDao  {

	private Connection connexion;

	public NacionalidadDao(Connection connextion)  {
		System.out.println("nacionalidad dao");
		this.connexion = connextion;
	}

	public List<String> listarNacionalidad() {

		List<String> nacionalidades = new ArrayList<String>();

		String query = "SELECT nac_pais FROM paises"; // Ajusta la consulta según tu estructura de base de datos

		try (PreparedStatement statement = connexion.prepareStatement(query);
				ResultSet resultSet = statement.executeQuery()) {
			while (resultSet.next()) {
				String nacionalidad = resultSet.getString("nac_pais"); // Ajusta el nombre de la columna según tu
																		// tabla
				nacionalidades.add(nacionalidad);
			}
			this.connexion.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
			// e.printStackTrace(); // Manejo básico de excepciones, puedes personalizarlo
		}
		return nacionalidades;
	}

	public void cargarNacionalidad() {
		String naciones[] = { "afgano-afgana", "alemán-alemana", "árabe-árabe", "argentino-argentina",
				"australiano-australiana", "belga-belga", "boliviano-boliviana", "brasileño-brasileña",
				"camboyano-camboyana", "canadiense-canadiense", "chileno-chilena", "chino-china",
				"colombiano-colombiana", "coreano-coreana", "costarricense-costarricense", "cubano-cubana",
				"danés-danesa", "ecuatoriano-ecuatoriana", "egipcio-egipcia", "salvadoreño-salvadoreña",
				"escocés-escocesa", "español-española", "estadounidense-estadounidense", "estonio-estonia",
				"etiope-etiope", "filipino-filipina", "finlandés-finlandesa", "francés-francesa", "galés-galesa",
				"griego-griega", "guatemalteco-guatemalteca", "haitiano-haitiana", "holandés-holandesa",
				"hondureño-hondureña", "indonés-indonesa", "inglés-inglesa", "iraquí-iraquí", "iraní-iraní",
				"irlandés-irlandesa", "israelí-israelí", "italiano-italiana", "japonés-japonesa", "jordano-jordana",
				"laosiano-laosiana", "letón-letona", "letonés-letonesa", "malayo-malaya", "marroquí-marroquí",
				"mexicano-mexicana", "nicaragüense-nicaragüense", "noruego-noruega", "neozelandés-neozelandesa",
				"panameño-panameña", "paraguayo-paraguaya", "peruano-peruana", "polaco-polaca", "portugués-portuguesa",
				"puertorriqueño-puertorriqueño", "dominicano-dominicana", "rumano-rumana", "ruso-rusa", "sueco-sueca",
				"suizo-suiza", "tailandés-tailandesa", "taiwanes-taiwanesa", "turco-turca", "ucraniano-ucraniana",
				"uruguayo-uruguaya", "venezolano-venezolana", "vietnamita-vietnamita" };

		for (int i = 0; i < naciones.length; i++) {
			Nacionalidad nacionalidad = new Nacionalidad(naciones[i]);
			guardar(nacionalidad);
		}

	}

	public void guardar(Nacionalidad nacionalidad) {
		if (!existeNacionalidad(nacionalidad.getNacion_pais())) {
			String sqlQuery = "INSERT INTO paises (nac_pais) VALUES (?) ";
			try (PreparedStatement statement = connexion.prepareStatement(sqlQuery)) {
				statement.setString(1, nacionalidad.getNacion_pais());
				statement.executeUpdate();
			} catch (SQLException e) {
				throw new RuntimeException(e);
				// e.printStackTrace(); // Manejo básico de excepciones, puedes personalizarlo
			}
		}

	}

	private boolean existeNacionalidad(String nacionalidad) {
		String query = "SELECT COUNT(*) AS count FROM paises WHERE nac_pais = ?"; // Ajusta la consulta según tu
																				// estructura de base de datos
		try (PreparedStatement statement = connexion.prepareStatement(query)) {
			statement.setString(1, nacionalidad);

			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next()) {
					int count = resultSet.getInt("count");
					return count > 0;
				}
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
			// e.printStackTrace(); // Manejo básico de excepciones, puedes personalizarlo
		}

		return false;
	}

}