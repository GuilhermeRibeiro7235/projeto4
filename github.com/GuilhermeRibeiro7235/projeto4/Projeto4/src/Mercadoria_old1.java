import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;

public class Mercadoria_old1 {
	private int id;
	private String codigo;
	private String descricao;
	private String unidade;
	private Double preco;
	private Date dataAtualizacao;
	private boolean ativo;
	private String codImagem;
	private boolean codigoExiste;

	@Override
	public String toString() {
		return "Mercadoria [id=" + id + ", codigo=" + codigo + ", descricao=" + descricao + ", unidade=" + unidade
				+ ", preco=" + preco + ", dataAtualizacao=" + dataAtualizacao + ", ativo=" + ativo + ", codImagem="
				+ codImagem + ", codigoExiste=" + codigoExiste + "]";
	}

	public Mercadoria_old1(String codigo, String descricao, String unidade, Double preco, Date dataAtualizacao,
			boolean ativo, String codImagem, boolean codigoExiste) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.unidade = unidade;
		this.preco = preco;
		this.dataAtualizacao = dataAtualizacao;
		this.ativo = ativo;
		this.codImagem = codImagem;
		this.codigoExiste = codigoExiste;
	}
	
	

	public Mercadoria_old1() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getCodImagem() {
		return codImagem;
	}

	public void setCodImagem(String codImagem) {
		this.codImagem = codImagem;
	}

	public boolean isCodigoExiste() {
		return codigoExiste;
	}

	public void setCodigoExiste(boolean codigoExiste) {
		this.codigoExiste = codigoExiste;
	}

	public void inserir(Connection conn) {

		String comando = "insert into mercadoria (codigo, descricao, unidade, preco, dataAtualizacao, ativo) values(?,?,?,?,?,?)";
		try (PreparedStatement ps = conn.prepareStatement(comando, Statement.RETURN_GENERATED_KEYS)) {

			ps.setString(1, getCodigo());
			ps.setString(2, getDescricao());
			ps.setString(3, getUnidade());
			ps.setDouble(4, getPreco());
			ps.setDate(5, (java.sql.Date) getDataAtualizacao());
			ps.setBoolean(6, isAtivo());
			ps.execute();

			try (ResultSet rs = ps.getGeneratedKeys()) {
				if (rs.next()) {
					setCodigo(rs.getString(1));
				}
			} catch (SQLException s) {
				s.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void carregar(Connection conn) {
		String comando = "select codigo, descricao, unidade, preco from mercadoria where idMercadoria=?";
		try (PreparedStatement pst = conn.prepareStatement(comando);) {

			int var = Integer.parseInt(JOptionPane.showInputDialog("Digite o id"));
			pst.setInt(1, var);

			try (ResultSet rs = pst.executeQuery();) {
				if (rs.next()) {
					codigo = rs.getString("codigo");
					descricao = rs.getString("descricao");
					unidade = rs.getString("unidade");
					preco = rs.getDouble("preco");
				} else {
					id = -1;
					codigo = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void exclusaoLogica(Connection conn) {
		String comando = "update mercadoria set ativo = ? where idMercadoria=?";
		try (PreparedStatement pst = conn.prepareStatement(comando);) {

			pst.setBoolean(1, false);
			int var = Integer.parseInt(JOptionPane.showInputDialog("Digite o id"));
			pst.setInt(2, var);
			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualizar(Connection conn) {
		String comando = "update mercadoria set codigo=?, descricao=?, unidade=?, preco=? where idMercadoria=?";
		try (PreparedStatement pst = conn.prepareStatement(comando);) {

			int var0 = Integer.parseInt(JOptionPane.showInputDialog("Digite o id"));
			String var1 = JOptionPane.showInputDialog("Digite o codigo");
			String var2 = JOptionPane.showInputDialog("Digite o descricao");
			String var3 = JOptionPane.showInputDialog("Digite o unidade");
			Double var4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco"));

			pst.setString(1, var1);
			pst.setString(2, var2);
			pst.setString(3, var3);
			pst.setDouble(4, var4);
			pst.setInt(5, var0);

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
