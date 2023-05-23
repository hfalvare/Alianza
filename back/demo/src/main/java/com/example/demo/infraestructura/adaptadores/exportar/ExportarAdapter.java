package com.example.demo.infraestructura.adaptadores.exportar;
/*
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
*/
public class ExportarAdapter {

/*
    public byte[] createFile(List<NotificacionUniversidad> listaInformeUniversidades) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        try (InputStream inputStream = new ByteArrayInputStream(getTemplate(Constantes.PATHFILE))) {

            XSSFWorkbook wb = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = wb.getSheetAt(0);

            fillFile(sheet, listaInformeUniversidades);
            wb.write(outputStream);
            return outputStream.toByteArray();

        } catch (IOException e) {
            log.error("OCURRIO UN ERROR AL GENERAR EL EXCEL {} - {}", e.getMessage(), e.getStackTrace());
        }
        return null;
    }

    private void fillFile(XSSFSheet sheet, List<NotificacionUniversidad> listaInformeUniversidades) {
        int numRow = 2;
        Integer numColumn;

        for (NotificacionUniversidad listaInformeUniversidad : listaInformeUniversidades) {
            numColumn = 0;
            XSSFRow row = sheet.createRow(numRow);
            fillSolicitud(row, numColumn, listaInformeUniversidad);
            numRow++;
        }
    }

    private Integer fillSolicitud(XSSFRow row, Integer numColumn, NotificacionUniversidad camposInformeUniversidad) {
        XSSFCell cell;

        // primera seccion excel datos universidad
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getNombreTercero());
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getTipoIdTercero());
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getNorIdTercero());
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getEmailUniversidad());

        //segunda seccion excel datos afiliado
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getTipoIdAfiliado());
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getNroIdAfiliado());
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getNombreAfiliado());

        //Tercera seccion excel datos estudiante
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getTipoIdEstudiante());
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getCodigoEstudiante());
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getNombreEstudiante());
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getNroIdEstudiante());

        //cuarta seccion excel datos concepto pago
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getDescripcionConceptoPago());
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getConceptoPago());

        ///quinta seccion valor pagado
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getValorNetoPagado());

        //sexta seccion informacion del pago
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getNumeroAutorizacion());
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getEntidadFinanciera());
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getTipoCuentaBancaria());
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getNroCuentaBancaria());
        cell = row.createCell(numColumn++);
        cell.setCellValue(camposInformeUniversidad.getFechaPago());

        return numColumn;
    }

    private byte[] getTemplate(String path) {
        try {
            return UtilsData.getResourceContentImputStream(getClass(), path);
        } catch (IOException e) {
            log.info("Ocurrio un error obteniendo la plantilla {}", e);
        }
        return null;
    }
    */

}
