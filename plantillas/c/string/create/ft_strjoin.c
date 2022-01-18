/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strjoin.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: jre-gonz <jre-gonz@student.42madrid.com>   +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2022/01/18 12:34:54 by jre-gonz          #+#    #+#             */
/*   Updated: 2022/01/18 12:35:05 by jre-gonz         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <stdlib.h>

int	ft_strlen(char *str)
{
	int	l;

	l = 0;
	while (*(str + l))
		l++;
	return (l);
}

int	ft_strcat(char **dest, char *src, int offset)
{
	int	i;

	i = 0;
	while (src[i])
	{
		dest[0][offset + i] = src[i];
		i++;
	}
	dest[0][offset + i] = '\0';
	return (offset + i);
}

char	*ft_strjoin(int size, char **strs, char *sep)
{
	char	*join;
	int		l;
	int		i;
	int		sep_l;

	i = 0;
	l = 0;
	sep_l = ft_strlen(sep);
	while (i < size)
		l += sep_l + ft_strlen(strs[i++]);
	if (size > 0)
		l -= sep_l;
	join = malloc ((l + 1) * sizeof(char));
	l = 0;
	if (size > 0)
		l = ft_strcat(&join, strs[0], l);
	i = 1;
	while (i < size)
	{
		l = ft_strcat(&join, sep, l);
		l = ft_strcat(&join, strs[i++], l);
	}
	join[l] = 0;
	return (join);
}
