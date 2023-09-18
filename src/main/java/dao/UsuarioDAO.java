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
    
    public List<Usuario> lista() throws IOException{
    List<Usuario> listaDados = new ArrayList<Usuario>();

        try{
            FileInputStream arquivo = new FileInputStream(new File(UsuarioDAO.fileName));

            XSSFWorkbook workbook = new XSSFWorkbook(arquivo);
            XSSFSheet sheetDados = workbook.getSheetAt(1);//antigo 0

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
                        case 5:
                            dados.setNomePai(cell.getStringCellValue());
                        break;
                        case 8:
                            dados.setEmailPai(cell.getStringCellValue());
                        break;
                        case 9:
                            dados.setNomeMae(cell.getStringCellValue());
                        break;
                        case 12:
                            dados.setEmailMae(cell.getStringCellValue());
                        break;
                        
                        case 13:
                            dados.setEndereco(cell.getStringCellValue());
                        break;
                        case 14:
                            dados.setNumero(cell.getNumericCellValue());
                        break;
                        case 15:
                            dados.setComplemento(cell.getStringCellValue());
                        break;
                        case 16:
                            dados.setCep(cell.getStringCellValue());
                        break;
                        case 17:
                            dados.setBairro(cell.getStringCellValue());
                        break;
                    }
                }
            }
            workbook.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Arquivo não encontrado");
        }
        
        return listaDados;
    }
    
    public Usuario buscaRA(int ra){
        
        UsuarioDAO consulta = new UsuarioDAO();
        try{
            List<Usuario> listaDados = consulta.lista();
        for (int i = 0; i < listaDados.size(); i++) {
            Usuario resultRA = listaDados.get(i);
            if (resultRA.getRa()==ra) {
                return resultRA;
            }
        }
        }catch(IOException e){}
        return null;
    }
    
    public Usuario buscaNome(String nome){
        
        UsuarioDAO consulta = new UsuarioDAO();
        try{
            List<Usuario> listaDados = consulta.lista();
        for (int i = 0; i < listaDados.size(); i++) {
            Usuario resultNome = listaDados.get(i);
            if (resultNome.getNome().equals(nome)) {
                return resultNome;
            }
        }
        }catch(IOException e){
            System.out.println("Sem nome");
        }
        return null;
    }
}
