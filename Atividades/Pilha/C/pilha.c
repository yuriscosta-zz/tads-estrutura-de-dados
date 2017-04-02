#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

struct No {
    int ordem;
    int numero;
    struct No *proximo;
};

struct No *Base = (struct No*) NULL;
struct No *Topo = (struct No*) NULL;
struct No *Atual = (struct No*) NULL;

void exibe() {
    Atual = Base;
    printf("\n");
    while (Atual != (struct No*) NULL) {
        printf("Ordem: %d | Valor: %d\n", Atual-> ordem, Atual-> numero);
        Atual = Atual-> proximo;
    }
    printf("\n");
    menu();
}

void desempilhar() {
    if (Base == (struct No*) NULL) {
        printf("A pilha não foi inicializada!\n");
    } else if (Base == Topo) {
        Atual = Base;
        free(Atual);
        Base = Topo = (struct No*) NULL;
    } else {
        Atual = Base;
        while(Atual-> proximo != Topo) {
            Atual = Atual-> proximo;
        }

        free(Topo);
        Topo = Atual;
        Atual-> proximo = (struct No*) NULL;
    }
    menu();
}

void empilhar() {
    if(Base == (struct No*) NULL) {
    	printf("A pilha não foi inicializada!\n");
    } else {
        int valor;
        printf("Digite o valor que deseja inserir: ");
        scanf("%d", &valor);

        Topo-> proximo = (struct No*) malloc(sizeof(struct No));
        Atual = Topo-> proximo;
        Atual-> ordem = Topo-> ordem + 1;
        Topo = Atual;
        Atual-> numero = valor;
        Atual-> proximo = (struct No*) NULL;
    }

    menu();
}

void inicia() {
    Atual = Base = Topo = (struct No*) malloc(sizeof(struct No));
    Atual-> ordem = 1;
    Atual-> proximo = (struct No*) NULL;
    int valor;
    printf("Digite o valor que deseja inserir: ");
    scanf("%d", &valor);
    Atual-> numero = valor;
    menu();
}

void getTamanho() {
    if (Base == (struct No*) NULL) {
        printf("A pilha não foi inicializada!\n");
    } else {
        printf("Tamanho: %d\n", Topo-> ordem);
    }
    menu();
}

void salvarPilhaEmArquivo() {
    char arquivo[20];
    printf("\n Escolha um nome pro arquivo: ");
    scanf("%s", arquivo);
    strcat(arquivo, ".txt");
    FILE *arq;
    Atual = Base;
    int valor;

    arq = fopen(arquivo, "w");
    while (Atual != (struct No*) NULL) {
        valor = Atual-> numero;
        fprintf(arq, "%d \n", valor);
        Atual = Atual-> proximo;
    }

    fclose(arq);
    printf("Pilha inserida no arquivo com sucesso!\n");
    menu();
}

int menu(void) {
    int opcao;
    printf("=================================\n");
    printf("| Selecione uma opção abaixo:   |\n");
    printf("=================================\n");
    printf("| 1 - Iniciar pilha             |\n");
    printf("| 2 - Exibir Pilha              |\n");
    printf("| 3 - Desempilhar               |\n");
    printf("| 4 - Empilhar                  |\n");
    printf("| 5 - Salvar                    |\n");
    printf("| 6 - Tamanho da pilha          |\n");
    printf("| 99 - Sair                     |\n");
    printf("=================================\n");
    printf("| Opção: ");
    scanf("%d", &opcao);


    if(opcao == 1) {
        inicia();
    } else if(opcao == 2) {
        exibe();
    } else if(opcao == 3) {
        desempilhar();
    } else if(opcao == 4) {
        empilhar();
    } else if(opcao == 5) {
        salvarPilhaEmArquivo();
    } else if(opcao == 6) {
        getTamanho();
    } else if(opcao == 99) {
        exit(0);
    } else {
        printf("Insira uma opção válida!\n");
        menu();
    }

}

int main(int argc, char **argv) {
    setlocale(LC_ALL,"");
    menu();
    return 0;
}
