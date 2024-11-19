package project.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.enums.Currency;

@Entity
@Table(name = "bank_accounts")
@NoArgsConstructor
@Data
public class Account {
//    (id, number, amount, currency)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String number;

    private double amount;

    private Currency currency;

    private long user_id;
}
