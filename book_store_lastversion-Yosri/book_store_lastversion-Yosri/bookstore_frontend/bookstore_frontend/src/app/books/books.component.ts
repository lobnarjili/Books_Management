import { Component, OnInit } from '@angular/core';
import { Book } from '../shared/book';
import { Router } from '@angular/router';
import { BookService } from '../services/book.service';
import { AuthService } from '../services/auth.service';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent 
  implements OnInit{

   books!:Book[]
    errMsg!:string
    isWaiting:boolean=false;
    isWaitingDelete:boolean=false;
    showAdminFn = false;
    authUserSub!: Subscription;
    constructor(
      private router:Router,
      private bookService:BookService,
      private authService: AuthService
    ){}
    ngOnInit(): void {
      this.bookService.getBooks().subscribe(
        {
          next: (books: Book[]) => { this.books = books; this.isWaiting = false; this.errMsg = "" },
          error: (err) => { this.books = [], this.isWaiting = false; this.errMsg = err }
        }
      )

          // Subscribe to the AuthenticatedUser$ observable
    this.authUserSub=this.authService.AuthenticatedUser$.subscribe({
      next: user => {
        // If user is authenticated
        if (user) {
          // Show admin Fn if user has admin role
          this.showAdminFn = user.role.name === 'ROLE_ADMIN';
          console.log(this.showAdminFn);

        } else {
          this.showAdminFn = false;
        }
      }
    })
    }


  onDelete(id: number) {
    this.isWaitingDelete = true
    this.bookService.deleteBookById(id).subscribe(
      {
        next: (res: any) => {
          this.isWaitingDelete = false
          let index = this.books.findIndex(book => book.id === id);
          if (index != -1) {
            this.books.splice(index, 1);
          }
        }
      }
    );

  }

onAddBook() {
 console.log("emchi bras omek ")
  this.router.navigateByUrl('/books/edit/-1')
}

}
