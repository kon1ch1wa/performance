package ru.aps.performance.models

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.Id
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Column

import java.time.LocalDateTime

@Entity
@Table(name="Messages")
data class Message(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = -1,

    @Column(name="chat_id")
    val chatId: Long,

    @Column(name="sender_id")
    val senderId: String,

    val content: String,

    val timestamp: LocalDateTime = LocalDateTime.now()
)