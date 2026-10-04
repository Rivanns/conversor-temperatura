package com.requenha.conversor_temperatura.service;

import org.springframework.stereotype.Service;

@Service
public class ConversorService {
	
	public double Converter(double temperatura, int de, int para) {
		
		if(de == para) {
			return temperatura;
		}
		
		switch (de) {
		case 1:
			if (para == 2)
                return (temperatura * 9.0 / 5.0) + 32.0;
            if (para == 3)
                return temperatura + 273.15;
            break;
        case 2:
            if (para == 1)
                return (temperatura - 32.0) * 5.0 / 9.0;
            if (para == 3)
                return (temperatura - 32.0)* 5.0 / 9.0 + 273.15;
            break;
        case 3:
            if (para == 1)
                return temperatura - 273.15;
            if (para == 2)
                return (temperatura - 273.15) * 9.0 / 5.0 + 32.0;
            break;
		}
        return 0.0;
	}

}
