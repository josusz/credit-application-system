package dev.josusz.credit.application.system.repository

import dev.josusz.credit.application.system.entity.Credit
import org.springframework.data.jpa.repository.JpaRepository

interface CreditRepository: JpaRepository<Credit, Long> {
}