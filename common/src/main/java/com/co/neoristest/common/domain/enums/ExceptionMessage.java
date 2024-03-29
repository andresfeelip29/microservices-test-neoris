package com.co.neoristest.common.domain.enums;

public enum ExceptionMessage {

    USER_NOT_FOUND("No existe usuario registrado en sistema con id: %d!"),
    USERNAME_NOT_FOUND("No existe usuario registrado en sistema con nombre de usuario: %s!"),
    ACCOUNT_NOT_FOUND("No existe cuenta registrada en sistema con id: %d!"),
    ACCOUNT_NUMBER_NOT_FOUND("No existe cuenta registrada con numero de cuenta: %s!"),
    ACCOUNT_ASSOCIATED_TO_CLIENT_NO_FOUND("No existe una cuenta con id: %d , asociado a algun usuario en microservicio de usuarios!"),

    ACCOUNT_NUMBER_ASSOCIATED_TO_CLIENT_NO_FOUND("No existe una cuenta con numero: %s , asociado a algun usuario en microservicio de usuarios!"),

    INCORRECT_CREDENTIALS("Credenciales incororrestas!"),

    ACCOUNT_NOT_FOUND_IN_MICROSERVICES_ACCOUNTS("No se encontro cuenta en microservicios de cuentas asociado al numero de cuenta: %S!"),

    ACCOUNT_HAS_NOT_BALANCE_FOR_TRANSACTION("La cuenta no tiene saldo disponible para realiza la transaccion!"),

    TRANSACTION_NOT_FOUND("No existe transaccion registrada con id: %s!"),

    INCORRECT_BANK_ACCOUNT("El tipo de cuenta suministrado debe ser Ahorro o Corriente, el valor ingresado fue: %s"),
    BALANCE_NEGATIVE("El monto de la cuenta no puede ser menor que cero!"),

    BALANCE_UPDATE_ERROR("No se pudo actualizar balance de transacciones realizada en cuenta con id: %s"),

    ERROR_SAVE_USER_IN_MICROSERVICES_USERS("No se pudo guardar usuario en microservicios de usuarios!")


    ;

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
