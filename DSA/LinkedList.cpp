#include "iostream"
#include <stdlib.h>

struct Node{
    int data;
    struct  Node *next;
};
struct Node *first = nullptr;
struct Node *second, *third;

void create(int A[], int size){
    int i;
    struct Node *newNode, *last;
    first = (struct Node *)malloc(sizeof(struct Node));
    first->data=A[0];
    first->next=NULL;
    last = first;
    for (i=1;i<size;i++){
        newNode = (struct Node *)malloc(sizeof(struct Node));
        newNode->data=A[i];
        newNode->next=NULL;
        // linking last's/first's next address to newNode
        last->next=newNode;
        last = newNode;
    }
}
void create2(int A[], int size){
    int i;
    struct Node *newNode, *last;
    second = (struct Node *)malloc(sizeof(struct Node));
    second->data=A[0];
    second->next=NULL;
    last = second;
    for (i=1;i<size;i++){
        newNode = (struct Node *)malloc(sizeof(struct Node));
        newNode->data=A[i];
        newNode->next=NULL;
        // linking last's/first's next address to newNode
        last->next=newNode;
        last = newNode;
    }
}
void Display(struct Node *p){
    while (p!=NULL){
        std::cout<<p->data<<" ";
        p=p->next;
    }
}
int pCount;
int count(struct Node *p){
    while (p!=NULL){
        p=p->next;
        pCount+=1;
    }
    return pCount;
}

void Insert(struct Node *p, int index, int value){
    int i;
    struct Node *newNode;

    if (index<0||index>count(p)){
        return;
    }
    newNode=(struct Node *)malloc(sizeof(struct Node));
    newNode->data= value;
// at index 0
    if (index==0){
        newNode->next=first;
        first=newNode;
    }
        //after any valid index
    else{
        for (i=0;i<index-1;i++){
            p=p->next;
            newNode->next=p->next;
            p->next=newNode;
        }
    }
}

int  Delete(struct Node *p, int index){
    struct Node *q=NULL;
    if (index<0||index>count(p)){
        return -1;
    }
    if (index==0){
        q=first;
        first=first->next;
        free(q);
    }
    else{
        for(int i=0;i<index;i++) {
            q = p;
            p = p->next;
        }
        q->next=p->next;
        free(p);

    }


}
bool isSorted(struct Node *p){
    int x=INTMAX_MIN;
    while(p!=NULL){
        if (p->data<x)
            return false;
        x=p->data;
        p=p->next;
    }
    return true;
}

int Duplicate(struct Node *p){
    struct Node *q;
    p=first;
    q=first->next;
    while (q!=NULL){
        if (p->data!=q->data){
            p=q;
            q=q->next;
        } else{
            p->next=q->next;
            free(q);
            q=p->next; // if q=p; i.e p=first;
        }
    }
}
void ReversingWithArray(struct Node *p){
    int A[8]; //calculate dynamic size of array
    p=first;
    int i;
    for(i=0; p!=NULL; i++){
        A[i]=p->data;
        p=p->next;
    }
    p=first;
    i--;
    for (i = 8-1; i>=0; i--) {
        p->data=A[i];
        p=p->next;
    }
}
void RevWithSlidingPointers(struct Node *p){
    struct Node *q,*r;
    q=r=NULL;
    p=first;
    while (p!=NULL){
        r=q;
        q=p;
        p=p->next;
        q->next=r;
    }
    first=q;
}
void RevRecursion(struct Node *q, struct Node *p){
    if (p){
        RevRecursion(p,p->next);
        p->next=q;
    }
    else
        first = q;
}
void Concatenate(struct Node *p, struct Node *q){
    third=p;
    while(p->next!=NULL){
        p=p->next;
    }
    p->next=q;
}
void Merge(struct Node *p, struct Node *q){
    struct Node *last;
    if (p->data<q->data){
        third=last=p;
        p=p->next;
        third->next=NULL;
    }
    else{
        third=last=q;
        q=q->next;
        third->next=NULL;
    }
    while (p&&q){
        if (p->data<q->data) {
            last->next=p;
            last=p;
            p=p->next;
            last->next=NULL;
        }
        else{
            last->next=q;
            last=q;
            q=q->next;
            last->next=NULL;
        }
        if (p) last->next=p;
        if (q) last->next=q;
    }
}
//bool isLoop(struct Node *first){
//    struct Node *p, *q;
//    p = q= first;
//    do{
//        p=p->next;
//        q=q->next;
//        q=q?q->next:q;
//    } while (p&&q&&p!=q);
//        if(q)
//            return true;
//        else{
//            return false;
//        }
//}
int main(){
    int A[]={2,10,1,2,5,621,6,7};
    int B[]={3,1,2,3,4};
    create(A,sizeof(A)/sizeof(A[0]));
    create2(B,sizeof(B)/sizeof(B[0]));
//      Insert(first,2,100);
//      Delete(first, 5);
//      printf("%s\n",isSorted(first)?"true":"false");
//      Duplicate(first);
//      ReversingWithArray(first);
//      RevWithSlidingPointers(first);
//      RevRecursion(NULL,first);
//      Concatenate(first,second);
    Merge(first,second);
    Display(third);


}