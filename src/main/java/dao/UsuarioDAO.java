package dao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import modelo.Usuario;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Facilitador Maker
 */
public class UsuarioDAO {
    private static final String fileName = "C:/Users/Facilitador Maker/Desktop/Lista Alunos/Monte - 2023/Lista/Lista consulta.xlsx";
    
    public Usuario pessoa(int ra) throws IOException{
    List<Usuario> listaDados = new ArrayList<Usuario>();

        try{
            FileInputStream arquivo = new FileInputStream(new File(UsuarioDAO.fileName));

            XSSFWorkbook workbook = new XSSFWorkbook(arquivo);
            XSSFSheet sheetDados = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheetDados.iterator();
            while(rowIterator.hasNext()){
                Row row = rowIterator.next();
                
                Iterator<Cell> cellIterator = row.cellIterator();

                Usuario dados = new Usuario();
                listaDados.add(dados);
                while(cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    switch (cell.getColumnIndex()) {
                        case 0:
                            dados.setRa(cell.getNumericCellValue());
                        break;
                        case 1:
                            dados.setNome(cell.getStringCellValue());
                        break;
                        case 2:
                            dados.setTurma(cell.getStringCellValue());
                        break;
                        case 3:
                            dados.setDataNasc(cell.getDateCellValue());
                        break;
                        case 4:
                            dados.setNomePai(cell.getStringCellValue());
                        break;
                        case 5:
                            dados.setEmailPai(cell.getStringCellValue());
                        break;
                        case 6:
                            dados.setNomeMae(cell.getStringCellValue());
                        break;
                        case 7:
                            dados.setEmailMae(cell.getStringCellValue());
                        break;
                    }
                }
            }
            workbook.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Arquivo não encontrado");
        }
        
        for (int i = 0; i < listaDados.size(); i++) {
            Usuario caixa = listaDados.get(i);
            if (caixa.getRa()==ra) {
                return caixa;
            }
        }
        return null;
    }
}
