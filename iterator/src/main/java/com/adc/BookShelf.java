package com.adc;

public class BookShelf implements Iterable<Book> {
    private Book[] books;
    private int capacity;
    private int size;

    public BookShelf(int capacity) {
        if (capacity < 0) {
            throw new NegativeArraySizeException();
        }
        this.books = new Book[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public void add(Book book) {
        if (size == capacity) {
            throw new ArrayIndexOutOfBoundsException();
        }
        books[size++] = book;
    }

    public Book get(int index) {
        if (index < 0 || index > capacity - 1) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return books[index];
    }

    public int size() {
        return size;
    }


    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator();
    }


    private class BookShelfIterator implements Iterator<Book> {
        private int position = 0;

        @Override
        public boolean hasNext() {
            return position <= size - 1;
        }

        @Override
        public Book next() {
            return books[position++];
        }
    }
}
