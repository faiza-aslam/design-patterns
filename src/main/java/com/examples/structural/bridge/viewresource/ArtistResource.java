package com.examples.structural.bridge.viewresource;

public class ArtistResource implements IResource {

  private final Artist artist;

  public ArtistResource(Artist artist) {
    this.artist = artist;
  }

  @Override
  public String getSummary() {
    return this.artist.getBiography();
  }

  @Override
  public String getTitle() {
    return this.artist.getName();
  }

  @Override
  public String getImage() {
    return this.artist.getPicture();
  }

  @Override
  public String getUrl() {
    return "www.somefakeurl.com";
  }
}
