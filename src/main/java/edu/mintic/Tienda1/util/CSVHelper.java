/*package edu.mintic.Tienda1.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;
import org.springframework.web.multipart.MultipartFile;

import edu.mintic.Tienda1.model.entity.Provider;


public class CSVHelper {
    public static String TYPE = "text/csv";
    static String[] headers = { "Id", "Nit", "Ciudad", "Direccion", "Nombre", "Telefono" };

    public static boolean hasCSVFormat(MultipartFile file) {
        if (TYPE.equals(file.getContentType()) || file.getContentType().equals("application/vnd.ms-excel")) {
            return true;
        }
        return false;
    }

    public static List<Provider> csvToProviders(InputStream is) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                CSVParser csvParser = new CSVParser(fileReader,
                        CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

            List<Provider> providerList = new ArrayList<>();

            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            for (CSVRecord csvRecord : csvRecords) {
                Provider provider = new Provider(Integer.parseInt(csvRecord.get("Id")),
                        Long.parseLong(csvRecord.get("Nit")), csvRecord.get("Ciudad"), csvRecord.get("Direccion"),
                        csvRecord.get("Nombre"), csvRecord.get("Telefono"));

                providerList.add(provider);
            }

            return providerList;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
    }

    public static ByteArrayInputStream providerToCSV(List<Provider> providerList) {
        final CSVFormat format = CSVFormat.DEFAULT.withQuoteMode(QuoteMode.MINIMAL);

        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
                CSVPrinter csvPrinter = new CSVPrinter(new PrintWriter(out), format);) {
            for (Provider provider : providerList) {
                List<String> data = Arrays.asList(String.valueOf(provider.getId()), String.valueOf(provider.getNitProveedor()),
                        provider.getCiudadProveedor(), provider.getDireccionProveedor(), provider.getNombreProveedor(),
                        provider.getTelProveedor());

                csvPrinter.printRecord(data);
            }

            csvPrinter.flush();
            return new ByteArrayInputStream(out.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("fail to import data to CSV file: " + e.getMessage());
        }
    }
}
*/