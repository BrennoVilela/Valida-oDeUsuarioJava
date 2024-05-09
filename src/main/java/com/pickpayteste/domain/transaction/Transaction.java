package com.pickpayteste.domain.transaction;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;
import java.time.LocalDateTime;
import com.pickpayteste.domain.user.User;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name="Transactions")
@Table(name ="Transactions")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;
    @ManyToOne
    @JoinColumn(name = "reciver_id")
    private User reciver;
    private LocalDateTime timestamp;
}
