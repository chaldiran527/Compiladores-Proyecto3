#move <-
#load <-
#store ->
.data
	nl: .asciiz "\n"
	m1: .asciiz "Indique un entero: "
	m2: .asciiz "\nEl resultado es: "

.text

main:
    jal menuP

    li $v0, 10
    syscall
.end main

menuP:
    addi    $sp, $sp, 4 #reserva espacio de la pila 1 word
    sw $ra, ($sp)#->guarda $ra

    jal factMenu


    lw $ra, ($sp)#<-reestablece $ra
    addi    $sp, $sp, -4 #ajusta el puntero de la pila
    jr $ra
.end menuP

#*************************************************FACTORIAL******************************************
factMenu:
    addi    $sp, $sp, 8 #reserva espacio de la pila 2 word
    sw $ra, ($sp)#->guarda $ra
    #mensaje
    la $a0, m1
    jal printStr
    jal readInt
    #invoca factorial recursivo
    move $a0, $v0 #el n a calcular como argumento de fact
    jal fact #resultado en $v0
    sw $v0, -4($sp)#-> guarda resultado en la pila
    #mensaje
    la $a0, m2
    jal printStr
    #imprime resultado
    lw $a0, -4($sp)#<-
    jal printInt
    #new line
    la $a0, nl
    jal printStr

    lw $ra, ($sp)#<-reestablece $ra
    addi    $sp, $sp, -8 #ajusta el puntero de la pila
    jr $ra
.end factMenu

fact:
    addi    $sp, $sp, 8 #reserva espacio de la pila 2 words
    sw $ra, ($sp)#->guarda $ra

    move $t0, $a0 #n viene en $a0
    li $t1, 1
    beq $t0, $t1, fact1
    #else
    addi $a0, $t0, -1 #n-1 en $a0
    sw $t0, -4($sp)#->guarda n
    jal fact #result de llamada recursiva en $v0

    lw $t0, -4($sp)#<-
    move $t1, $v0#<-
    multu $t0, $t1
    mflo $v0 # 32 least significant bits of multiplication to $v0
    lw $ra, ($sp)#<-
    addi    $sp, $sp, -8 #ajusta el puntero de la pila
    jr $ra
fact1:
    lw $ra, ($sp)#<-
    addi    $sp, $sp, -8 #ajusta el puntero de la pila
    li $v0, 1
    jr $ra
.end fact

#*******************************************SYSCALL*****************************************************
printStr:
    li   $v0, 4
    syscall
    jr $ra
.end printStr

printInt:
    li   $v0, 1
    syscall
    jr $ra
.end printInt

printFloat:
    li   $v0, 2
    syscall
    jr $ra
.end printFloat

readInt:
    li   $v0, 5
    syscall
    jr $ra
.end readInt

readFloat:
    li   $v0, 6
    syscall
    jr $ra
.end readFloat