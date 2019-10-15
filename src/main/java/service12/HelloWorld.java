/**
 * HelloWorld.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service12;

public interface HelloWorld extends java.rmi.Remote {
    public service12.Member register(service12.Member arg0) throws java.rmi.RemoteException;
    public service12.City[] getAllCity() throws java.rmi.RemoteException;
    public service12.City getOneCity(long arg0) throws java.rmi.RemoteException;
    public service12.District[] getAllDistrict() throws java.rmi.RemoteException;
    public service12.District getOneDistrict(long arg0) throws java.rmi.RemoteException;
    public service12.Place[] getAllPlace() throws java.rmi.RemoteException;
    public service12.Place getDetailPlace(long arg0) throws java.rmi.RemoteException;
    public service12.CommentDto[] getCommentRating(long arg0) throws java.rmi.RemoteException;
    public service12.PlaceDTO[] getPlaceDTO() throws java.rmi.RemoteException;
    public service12.Place createPlace(service12.Place arg0) throws java.rmi.RemoteException;
    public service12.Rating createRating(service12.Rating arg0) throws java.rmi.RemoteException;
    public service12.Rating[] getRatingByPlaceId(long arg0) throws java.rmi.RemoteException;
    public service12.Comment createComment(service12.Comment arg0) throws java.rmi.RemoteException;
    public service12.Comment[] getCommentByPlaceId(int arg0) throws java.rmi.RemoteException;
    public service12.Member login(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public service12.Place[] getPlaceByCityId(long arg0) throws java.rmi.RemoteException;
    public service12.Place[] getPlaceByDistrictId(long arg0) throws java.rmi.RemoteException;
    public service12.Place[] getPlaceByName(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String sayHelloWorldFrom(java.lang.String arg0) throws java.rmi.RemoteException;
}
