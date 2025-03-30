#include <iostream>
#include <bits/stdc++.h>
using namespace std;
//inserting an element in linked list
//inserting at begining of linked list

struct node
{
    int data;
    struct node *link; 
};

//add element at begining
// struct node* add_beg(struct node *head, int d)
// {
//     struct node *ptr = (struct node*)malloc(sizeof(struct node));
//     ptr->data = d;
//     ptr->link = NULL;

//     ptr->link = head;
//     head  = ptr;
//     return head;
// }

void add_at_pos(struct node *head, int data, int pos)
{  
    struct node *ptr = head;
    struct node *ptr2 = (struct node*)malloc(sizeof(struct node));
    ptr2->data = data;
    ptr2->link = NULL;
    pos--;
    while(pos!=1)
    {
        ptr = ptr->link;
        pos--;
    }
    ptr2->link = ptr->link;
    ptr->link = ptr2;
}

//delete first node of linked list
struct node* del_first(struct node *head)
{
    if(head==NULL)
    {
        cout<<"List is already empty!"<<endl;
    }
    else{
        struct node *temp = head;
        head=head->link;
        free(temp);
    }
    return head;

}

//delete last node of single linked list --> two ppointer  
struct node* del_last(struct node *head)
{
   if(head==NULL)
   {
       cout<<"The list is already empty!"<<endl;
   } 
   else{
       struct node *temp = head;
       struct node *temp2 = head;
       while(temp->link !=NULL)
       {
           temp2 = temp;
           temp = temp->link;

       }
       temp2->link = NULL;
       free(temp);
       temp = NULL;
   }
   return head;
   
}

//delete certain position node from Linked list
void del_pos(struct node **head, int position)
{
    struct node *current = *head;
    struct node *previous = *head;
    if(*head == NULL)
    {
        cout<<"List is already empty"<<endl;
    }
    else if(position==1)
    {
        *head = current->link;
        free(current);
        current =NULL;

    }
    else{
        while(position !=1)
        {
            previous =current;
            current = current->link;
            position--;
        }
        previous->link = current->link;
        free(current);
        current = NULL;
    }
}

//delete entire single linked list
struct node* del_list(struct node *head)
{
    struct node *temp = head;
    while(temp!=NULL)
    {
        temp = temp->link;
        free(head);
        head = temp;

    }
    return head;
}

int main(void)
{
    struct node *head = (struct node*)malloc(sizeof(struct node));
    head->data = 45;
    head->link = NULL;

    struct node *ptr =(struct node*)malloc(sizeof(struct node));
    ptr->data =98;
    ptr->link = NULL;
    head->link = ptr;
    
    struct node *ptr1 =(struct node*)malloc(sizeof(struct node));
    ptr1->data =101;
    ptr1->link = NULL;
    head->link->link = ptr1;

    // int data =3;
    // head = add_beg(head, data);
    // head = add_beg(head, 14);
    // ptr = head;
    // int data = 67, pos =3;
    // add_at_pos(head, data, pos);
    // struct node *ptr = head;
    // head = del_first(head);
    // head = del_last(head);
    // int position =2;
    // del_pos(&head, position);
    // ptr = head;
    // while(ptr!=NULL)
    // {
    //     cout<<ptr->data<<" ";
    // //     ptr = ptr->link;
    // } 
    head = del_list(head);
    if(head == NULL)
    {
        cout<<"linked list deleted successfully!"<<endl;
    }
  return 0;
}