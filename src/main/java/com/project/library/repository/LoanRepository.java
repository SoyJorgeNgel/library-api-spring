package com.project.library.repository;

import com.project.library.model.Loan;
import com.project.library.model.User;
import com.project.library.model.enums.StatusLoan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findAllByUser(User user);

    List<Loan> findAllByStatusLoan(StatusLoan statusLoan);
}
