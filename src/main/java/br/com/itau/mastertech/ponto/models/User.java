package br.com.itau.mastertech.ponto.models;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @Column(name = "fullname", nullable = false)
	private String fullName;
	
    @Column(name = "cpf", nullable = false)
	private String cpf;
	
    @Column(name = "email", nullable = false)
	private String email;
	
    @Column(name = "registrydate", nullable = false, updatable = false)
    @CreationTimestamp
	private Timestamp registryDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_fid", referencedColumnName = "id", nullable = false)
    private List<Clock> clocks = new ArrayList<>();
	
}
