package com.platzi.javatests.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    // cuando tenemos código que se repite dentro de los test podemos crear una función que nos permita factorizarlo
    // las variables deben ser variables de la clase (variables globales)
    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;
    // normalmente se llama setup()
    // se le pone la notación @Before lo que indica que se debe ejecutar este método antes de cada test
    @Before
    public void setup(){
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void paymentIsCorrect(){
        // preparación del escenario
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        // llamada al método
        boolean response = paymentProcessor.makePayment(1000);
        // comprobación
        assertTrue(response);
    }

    @Test
    public void paymentIsWrong(){
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        // llamada al método junto con la comprobación
        assertFalse(paymentProcessor.makePayment(1000));
    }
}